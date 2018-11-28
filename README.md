# MySQL docker run

- create test db

```bash
$ docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=pass --name springboot_mysql mysql
$ docker exec -i -t springboot_mysql bash 
$ mysql -u root -p
$ create database testdb;

##
$ docker start [container ID]
```