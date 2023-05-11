CREATE TABLE jobs
(
    id          bigserial,
    dep_id      bigint not null,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(5000),
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp,
    PRIMARY KEY (id)
);

insert into jobs (dep_id, title, description)
values
(1, 'Директор', 'Директор предприятия'),
(2, 'Нач. АСУ', 'Начальник отдела АСУ'),
(2, 'Инж. АСУ', 'Инженер отдела АСУ'),
(3, 'Техник', 'Техник отдела АСУ'),
(4, 'Нач. ОК', 'Начальник отдела кадров');