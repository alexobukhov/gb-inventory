create table if not exists users
(
    id            bigserial primary key,
    firstname     VARCHAR(255) not null,
    lastname      VARCHAR(255) not null,
    middlename    VARCHAR(255) not null,
    grade         int not null,
    job_id        bigint not null,
    department_id bigint not null,
    email         VARCHAR(255) unique
);

CREATE TABLE IF NOT EXISTS departments
(
    id         bigserial PRIMARY KEY,
    title      VARCHAR(200) NOT NULL,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

create table if not exists producers
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table if not exists conditions
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table if not exists kinds
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table if not exists actives
(
    id              bigserial primary key,
    owner_Id        bigint,
    kind_id         int         not null references kinds (id),
    producer_id     int         not null references producers (id),
    model           varchar(50) not null,
    serial_number    varchar(50) not null unique,
    inventory_number bigserial   not null unique,
    condition_id    int         not null references conditions (id),
    description     varchar(255) default 'null',
    created_at      timestamp    default current_timestamp,
    updated_at      timestamp    default current_timestamp
);

CREATE TABLE if not exists jobs
(
    id          bigserial,
    dep_id      bigint not null,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(512),
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp,
    PRIMARY KEY (id)
);

create table if not exists orders
(
    id         bigserial primary key,
    user_id    bigint not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

create table if  not exists orders_items
(
    id               bigserial primary key,
    order_id         bigint references orders (id),
    active_id        bigint not null unique references actives (id),
    created_at       timestamp default current_timestamp,
    updated_at       timestamp default current_timestamp
);

