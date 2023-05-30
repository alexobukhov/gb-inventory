CREATE TABLE IF NOT EXISTS departments
(
    id         bigserial PRIMARY KEY,
    title      VARCHAR(200) NOT NULL,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

