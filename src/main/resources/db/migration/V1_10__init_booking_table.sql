CREATE TABLE booking (
  booking_id   SERIAL                             NOT NULL,
  booking_date_time TIMESTAMP WITH TIME ZONE      NOT NULL,
  start_date   DATE                               NOT NULL,
  end_date     DATE                               NOT NULL,
  price        NUMERIC(7, 2)                      NOT NULL,
  status       INT CHECK(STATUS BETWEEN 0 AND 3)  NOT NULL,
  customer_id  INT                                NOT NULL,
  vehicle_id   INT                                NOT NULL,
  PRIMARY KEY (booking_id),
  CONSTRAINT fk_booking_customer FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
  CONSTRAINT fk_booking_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicle (vehicle_id));