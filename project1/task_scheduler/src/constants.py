# Node status
CONST_NODE_FLAG_ACTIVE = 0
CONST_NODE_FLAG_DEAD = 10


# TODO: move this to a docker env variable for orchestration
MIN_HEARTBEAT_INTERVAL = 5 # in seconds

zmq_read_host = '0.0.0.0'
read_client_port = 5559
read_worker_port = 5560

zmq_write_host = '0.0.0.0'
write_pub_port = 8081
write_sub_port = 8082

DB_FILE_PATH = '/srv/tmp.db'

EMAILER_SENDER = 'cmpe275server@gmail.com'
EMAILER_SENDER_PASSWD = 'donghaosu'
EMAILER_RECIPIENTS = ['haoji.liu@sjsu.edu','donghao.su@sjsu.edu']
EMAILER_NODE_ERROR_SUBJECT = '[Warning]weather service node failure'
EMAILER_NODE_ERROR_BODY = 'Node %s is down.'
