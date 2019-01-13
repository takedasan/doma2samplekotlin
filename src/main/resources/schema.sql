drop table if exists person;
create table if not exists person (
    person_id int auto_increment primary key,
    name varchar(100),
    sex_type varchar(2)
);

drop table if exists address;
create table if not exists address (
    address_id int auto_increment primary key,
    address varchar(1000),
    person_id int
);