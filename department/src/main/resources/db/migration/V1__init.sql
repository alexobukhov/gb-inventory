CREATE TABLE departments (
        id                  bigserial primary key,
        title               VARCHAR(255),
        created_at          timestamp default current_timestamp,
        updated_at          timestamp default current_timestamp);
INSERT INTO departments (title)
VALUES
('Top management'),
 ('Financial department'),
  ('Account department'),
   ('Engineering department'),
    ('Administrative department'),
    ('HR department'),
     ('Development department'),
      ('Advertising department'),
       ('Law department'),
        ('Transportation department');
