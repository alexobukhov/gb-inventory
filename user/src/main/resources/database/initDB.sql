create table if not exists users
(
    id            bigserial primary key,
    firstName     varchar(50) not null,
    lastName      varchar(50) not null,
    middleName    varchar(50) not null,
    grade         int         not null,
    job_id        bigint      not null,
    department_id bigint      not null,
    email         varchar(50) unique
);