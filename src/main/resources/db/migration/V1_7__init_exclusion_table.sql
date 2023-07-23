CREATE TABLE exclusion (
  exclusion_id SERIAL NOT NULL,
  start_date   DATE   NOT NULL,
  end_date     DATE   NOT NULL,
  vehicle_id   INT4   NOT NULL,
  PRIMARY KEY (exclusion_id),
  CONSTRAINT fk_exclusion_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicle (vehicle_id));
