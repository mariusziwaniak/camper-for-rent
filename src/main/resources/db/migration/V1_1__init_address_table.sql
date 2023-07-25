CREATE TABLE address (
  address_id  SERIAL      NOT NULL,
  country     VARCHAR(64) NOT NULL,
  city        VARCHAR(64) NOT NULL,
  postal_code VARCHAR(10) NOT NULL,
  street      VARCHAR(64) NOT NULL,
  PRIMARY KEY (address_id));