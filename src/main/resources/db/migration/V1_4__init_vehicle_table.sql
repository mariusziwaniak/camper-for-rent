CREATE TABLE vehicle (
  vehicle_id  SERIAL      NOT NULL,
  brand       VARCHAR(64) NOT NULL,
  model       VARCHAR(64) NOT NULL,
  owner_id    INT4        NOT NULL,
  category_id INT4        NOT NULL,
  PRIMARY KEY (vehicle_id),
  CONSTRAINT fk_vehicle_category FOREIGN KEY (category_id) REFERENCES category (category_id),
  CONSTRAINT fk_vehicle_owner FOREIGN KEY (owner_id) REFERENCES owner (owner_id));