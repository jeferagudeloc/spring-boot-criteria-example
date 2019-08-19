FROM mysql:5.7

COPY entrypoint.sh /usr/local/bin/db-entrypoint.sh

RUN chmod -R 777 /usr/local/bin/db-entrypoint.sh

RUN cat /usr/local/bin/db-entrypoint.sh

ENTRYPOINT ["db-entrypoint.sh"]

CMD ["mysqld"]
