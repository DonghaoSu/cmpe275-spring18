# Author: Haoji Liu
# LABEL maintainer="divid86391@hotmail.com"
FROM cmpe275_base_image

ADD ./src /srv/src

COPY ./config/tmp.db /srv/tmp.db

RUN mkdir /srv/logs

EXPOSE 443 9002 5559 5560 80

# Copy config files over
ADD ./config/supervisord.conf /etc/supervisord.conf
CMD /usr/bin/supervisord -c /etc/supervisord.conf
