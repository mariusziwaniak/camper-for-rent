CREATE TABLE invoice (
  invoice_id        SERIAL                    NOT NULL,
  invoice_number    VARCHAR(64)               NOT NULL UNIQUE,
  invoice_date_time TIMESTAMP WITH TIME ZONE  NOT NULL,
  amount            NUMERIC(7, 2)             NOT NULL,
  invoice_type_id   INT                       NOT NULL,
  payment_type_id   INT                       NOT NULL,
  booking_id        INT                       NOT NULL,
  PRIMARY KEY (invoice_id),
  CONSTRAINT fk_invoice_booking FOREIGN KEY (booking_id) REFERENCES booking (booking_id),
  CONSTRAINT fk_invoice_invoice_type FOREIGN KEY (invoice_type_id) REFERENCES invoice_type (invoice_type_id),
  CONSTRAINT fk_payment_type_invoice FOREIGN KEY (payment_type_id) REFERENCES payment_type (payment_type_id));