CREATE TABLE price (
  price_id   SERIAL        NOT NULL,
  start_date DATE          NOT NULL,
  end_date   DATE          NOT NULL,
  price      NUMERIC(7, 2) NOT NULL,
  vehicle_id INT          NOT NULL,
  PRIMARY KEY (price_id),
  CONSTRAINT fk_price_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicle (vehicle_id));