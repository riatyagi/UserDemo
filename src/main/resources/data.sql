DROP TABLE IF EXISTS user1;
 
CREATE TABLE user1 (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  role VARCHAR(250) NOT NULL,
  phone_number long NULL
);
 
INSERT INTO user1 (first_name, last_name, email, role, phone_number) VALUES
  ('Aliko', 'Dangote', 'aliko@gmail.com','ADMIN',1234567899),
  ('Bill', 'Gates', 'Bill@gmail.com','USER',12),
  ('Mark', 'Dangote', 'Mark@gmail.com','USER',3242432423),
  ('John', 'Kim', 'John@gmail.com','USER',123456),
  ('Oliver', 'Alakija', 'Oliver@gmail.com','USER',123456),
  ('Folrunsho', 'Alakija', 'Folrunsho@gmail.com','USER',12345);
  