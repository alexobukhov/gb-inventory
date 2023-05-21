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