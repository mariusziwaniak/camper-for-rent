CREATE TABLE vehicle_detail (
  vehicle_detail_id SERIAL  NOT NULL,
  description       TEXT    NOT NULL,
  vehicle_id        INT     NOT NULL,
  detail_id         INT     NOT NULL,
  PRIMARY KEY (vehicle_detail_id),
  CONSTRAINT fk_vehicle_detail_detail FOREIGN KEY (detail_id) REFERENCES detail (detail_id),
  CONSTRAINT fk_vehicle_details_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicle (vehicle_id));