create table orders
(
    id         bigserial primary key,
    user_id    bigint not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

create table orders_items
(
    id               bigserial primary key,
    order_id         bigint references orders (id),
    inventory_number bigint not null,
    created_at       timestamp default current_timestamp,
    updated_at       timestamp default current_timestamp
);


insert into orders_items (order_id, inventory_number)
values (1, 000001),
       (1, 000002),
       (2, 000003),
       (2, 000004),
       (3, 000005);

insert into orders (user_id)
values (1),
       (2),
       (3);