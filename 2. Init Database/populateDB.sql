insert into users (firstName,lastName, middleName, grade, job_id, department_id, email)
values ('Богданов', 'Леонтий', 'Евгеньевич', 1, 1, 1, 'BogdanovLE@gmail.com'),
       ('Фадеев', 'Анатолий', 'Донатович', 2, 2, 2, 'FadeevAD@gmail.com'),
       ('Устинов', 'Нинель', 'Романович', 3, 2, 1, 'UstinovYR@gmail.com'),
       ('Лихачев', 'Донат', 'Арьемович', 4, 2, 2, 'LixachevDA@gmail.com'),
       ('Комиссаров', 'Захар', 'Агафонович', 5, 2, 2, 'KomissarovZA@gmail.com');


INSERT INTO departments (title)
VALUES ('Administrative department'),
       ('Transportation department'),
       ('Finance department'),
       ('HR department');

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

insert into jobs (dep_id, title, description)
values
    (0, 'Администратор', 'Администратор системы'),
    (1, 'Распределитель', 'Работник склада ИТ'),
    (2, 'Директор', 'Директор предприятия'),
    (3, 'Нач. АСУ', 'Начальник отдела АСУ'),
    (4, 'Инж. АСУ', 'Инженер отдела АСУ'),
    (5, 'Техник', 'Техник отдела АСУ'),
    (6, 'Нач. ОК', 'Начальник отдела кадров');

insert into orders (user_id)
values (1),
       (2),
       (3);

insert into orders_items (order_id, active_id, created_at, updated_at)
values (1, 1),
       (1, 2),
       (2, 3),
       (2, 4),
       (3, 5);

