CREATE TABLE payment (
  payment_id        SERIAL                   NOT NULL,
  payment_date_time TIMESTAMP WITH TIME ZONE NOT NULL,
  amount            NUMERIC(7, 2)            NOT NULL,
  invoice_id        INT                      NOT NULL,
  PRIMARY KEY (payment_id),
  CONSTRAINT fk_payment_invoice FOREIGN KEY (invoice_id) REFERENCES invoice (invoice_id));