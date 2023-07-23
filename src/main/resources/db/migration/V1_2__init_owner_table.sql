CREATE TABLE owner (
  owner_id   SERIAL      NOT NULL,
  company    VARCHAR(64) NOT NULL UNIQUE,
  nip        VARCHAR(11) NOT NULL UNIQUE,
  name       VARCHAR(64),
  surname    VARCHAR(64),
  phone      VARCHAR(15) NOT NULL,
  email      VARCHAR(64) NOT NULL UNIQUE,
  address_id INT4        NOT NULL,
  PRIMARY KEY (owner_id),
  CONSTRAINT fk_owner_address FOREIGN KEY (address_id) REFERENCES address (address_id));