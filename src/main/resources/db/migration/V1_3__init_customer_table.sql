CREATE TABLE customer (
  customer_id SERIAL      NOT NULL,
  name        VARCHAR(64) NOT NULL,
  surname     VARCHAR(64) NOT NULL,
  phone       VARCHAR(15) NOT NULL,
  email       VARCHAR(64) NOT NULL UNIQUE,
  address_id  INT         NOT NULL,
  PRIMARY KEY (customer_id),
  CONSTRAINT fk_customer_addres FOREIGN KEY (address_id) REFERENCES address (address_id));