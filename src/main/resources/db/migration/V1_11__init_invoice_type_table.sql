CREATE TABLE invoice_type (
  invoice_type_id SERIAL      NOT NULL,
  invoice_type    VARCHAR(25) NOT NULL UNIQUE,
  PRIMARY KEY (invoice_type_id));
COMMENT ON TABLE invoice_type IS '1 - Faktura zaliczka
2 - Faktur rozliczająca
3 - Faktura całość';