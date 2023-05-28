create table if not exists users
(
    id            bigserial primary key,
    username      varchar(50) not null,
    job_id        bigint not null,
    department_id bigint not null,
    email         varchar(50) unique
);