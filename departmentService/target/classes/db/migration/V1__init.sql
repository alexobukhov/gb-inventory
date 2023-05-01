CREATE TABLE departments (
        id                  bigserial primary key,
        title               VARCHAR(255),
        created_at          timestamp default current_timestamp,
        updated_at          timestamp default current_timestamp);
INSERT INTO departments (title)
VALUES
('Top Management'),
 ('Administrative department'),
  ('Accounting department'),
   ('IT department'),
    ('Programming department'),
    ('Security department'),
     ('First department'),
      ('Second department'),
       ('Third department'),
        ('Main department');
