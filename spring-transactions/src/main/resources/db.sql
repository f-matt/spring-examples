-- First database
create database tmp1;

create table t1 (
id integer primary key,
a integer,
b integer)

insert into t1 (id, a, b) values ('1', '111', '222'), ('2', '333', '444'), ('3', '555', '666')


-- Second database
create database tmp2;

create table t2 (
id integer primary key,
c integer,
d integer);

insert into t2 (id, c, d) values ('1', '123', '456'), ('2', '789', '987'), ('3', '654', '321');
