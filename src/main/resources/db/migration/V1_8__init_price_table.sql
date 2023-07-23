CREATE TABLE price (
  price_id   SERIAL        NOT NULL,
  valid_from DATE          NOT NULL,
  valid_to   DATE          NOT NULL,
  price      NUMERIC(7, 2) NOT NULL,
  vehicle_id INT4          NOT NULL,
  PRIMARY KEY (price_id),
  CONSTRAINT fk_price_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicle (vehicle_id));