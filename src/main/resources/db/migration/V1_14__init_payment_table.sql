CREATE TABLE payment (
  payment_id   SERIAL                   NOT NULL,
  payment_date TIMESTAMP WITH TIME ZONE NOT NULL,
  amount       NUMERIC(7, 2)            NOT NULL,
  invoice_id   INT4                     NOT NULL,
  PRIMARY KEY (payment_id),
  CONSTRAINT fk_payment_invoice FOREIGN KEY (invoice_id) REFERENCES invoice (invoice_id));