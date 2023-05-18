create table users
(
    id            bigserial primary key,
    username      varchar(50) not null,
    id_job        bigint not null,
    id_department bigint not null,
    email         varchar(50) unique
);

insert into users (username, email)
values ('Иванов И.И.',1,1,'IvanovII@gmail.com'),
       ('Петров П.П.',2,4,'PetrovPP@gmail.com'),
       ('Сидоров С.С.',2,4,'SidorovSS@gmail.com'),
       ('Иванов А.Е.',2,4,'IvanovAE@gmail.com'),
       ('Степанов С.И.',2,4,'StepanovSI@gmail.com'),
       ('Петров И.И.',2,4, 'PetrovII@gmail.com'),
       ('Иванов Е.Н.',2,4,'IvanovEN@gmail.com'),
       ('Петров П.И.',2,4,'PetroPI@gmail.com'),
       ('Милованова И.И.',4,6,'MilovanovaII@gmail.com'),
       ('Любимова В.Н.',2,4,'LubimovaVN@gmail.com');
