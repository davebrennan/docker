FROM mysql
ENV MYSQL_ROOT_PASSWORD=secret
COPY generateTableData.sql /docker-entrypoint-initdb.d/
