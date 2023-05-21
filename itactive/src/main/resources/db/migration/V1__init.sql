create table producers
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table conditions
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table kinds
(
    id    bigserial primary key,
    title varchar(255) not null
);

create table actives
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

insert into producers (title)
values ('Huawei'),
       ('LG'),
       ('DELL'),
       ('HP'),
       ('Samsung'),
       ('Compit'),
       ('Apple');

insert into conditions (title)
values ('New'),
       ('Used'),
       ('Defective');

insert into kinds (title)
values ('Системный блок'),
       ('Ноутбук'),
       ('Планшет'),
       ('Монитор'),
       ('Телефон'),
       ('Клавиатура'),
       ('Мышь'),
       ('Аудиогарнитура');

insert into actives (owner_Id, kind_id, producer_id, model, serial_number, condition_id)
values (1, 1, 1, 'AAA', '001', 1);