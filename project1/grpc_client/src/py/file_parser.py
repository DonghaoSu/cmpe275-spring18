# Author: Haoji Liu
import uuid
from data_pb2 import Request, PutRequest, DatFragment, MetaData

"""This takes in a data file, normalize it to the standard data pattern we have."""

CONST_MEDIA_TYPE_TEXT_MESOWEST = 'mesowest'
CONST_MEDIA_TYPE_TEXT_MESONET = 'mesonet'

# Looks like 1KB is a good chunk size ~10 lines
CONST_CHUNK_SIZE = 3  # number of lines per payload

CONST_MESOWEST_HEADER = 'STN YYMMDD/HHMM MNET SLAT SLON SELV TMPF SKNT DRCT GUST PMSL ALTI DWPF RELH WTHR P24I'
CONST_MESONET_HEADER = '??????'

CONST_HEADERS = (CONST_MESOWEST_HEADER, CONST_MESONET_HEADER)

CONST_TIMESTAMP_FMT = '%Y-%m-%d %H:%M:%S'

CONST_DELIMITER = ','
CONST_NEWLINE_CHAR = '\n'

# station, timestamp_utc, mnet??, latitude, longitude, temperature, ...
CONST_STD_COL_LIST = CONST_MESOWEST_HEADER.split()

def format_timestamp_mesowest(timestamp):
  """
  convert from 20180316/2145 to 2018-03-16 21:45:00
  """
  tuples = timestamp.split('/')
  assert len(tuples) == 2
  year = tuples[0][:4]
  month = tuples[0][4:6]
  day = tuples[0][6:8]
  hour = tuples[1][:2]
  minute = tuples[1][2:4]

  return '%s-%s-%s %s:%s:00' % (year, month, day, hour, minute)

def _normalize_mesonet(line, timestamp_utc):
  """Map mesonet to our standard format"""
  # add timestamp
  cols = line.split()
  return CONST_DELIMITER.join(cols[:1] + [timestamp_utc] + cols[1:])

def _normalize_mesowest(line):
  """Map mesowest to our standard format"""
  # replace timestamp with standardized one
  cols = line.split()
  timestamp_utc = format_timestamp_mesowest(cols[1])
  return CONST_DELIMITER.join(cols[:1] + [timestamp_utc] + cols[2:])

def normalize(line, data_source):
  if data_source == CONST_MEDIA_TYPE_TEXT_MESONET:
    return _normalize_mesonet(line)
  elif data_source == CONST_MEDIA_TYPE_TEXT_MESOWEST:
    return _normalize_mesowest(line)
  else:
    print('unsupported data format')

def parse_file(fpath):
  """read file and chunkify it to be small batch for grpc transport

  Returns: a string, concat of data rows, separated by newline char
  """
  buffer = []
  is_starts_reading = False
  is_mesonet = False

  # if fpath.split('/')[-1] looks like a timestamp:
  #   is_mesonet = True
  #
  with open(fpath) as f:
    for line in f:
      possible_header = ' '.join(line.strip().split())
      # For both mesonet and mesowest
      if possible_header in CONST_HEADERS:
        is_starts_reading = True
        # skip this line
        continue

      if not is_starts_reading:
        continue

      # we can't call strip() here as it will remove the newline char
      data_source = CONST_MEDIA_TYPE_TEXT_MESONET if is_mesonet else CONST_MEDIA_TYPE_TEXT_MESOWEST
      buffer.append(normalize(line, data_source))

      if len(buffer) == CONST_CHUNK_SIZE:
        res = CONST_NEWLINE_CHAR.join(buffer)
        buffer = []
        yield res
    # last batch
    if buffer:
      yield CONST_NEWLINE_CHAR.join(buffer)

def put_req_iterator(fpath, sender, receiver):
  my_uuid = str(uuid.uuid1())
  for raw in parse_file(fpath):
    yield Request(
      fromSender=sender,
      toReceiver=receiver,
      putRequest=PutRequest(
          metaData=MetaData(uuid=my_uuid),
          datFragment=DatFragment(data=raw.encode()))
      )

if __name__ == '__main__':
  for chunk in parse_file('../mesowesteasy.out'):
    print('--------')
    print(chunk)