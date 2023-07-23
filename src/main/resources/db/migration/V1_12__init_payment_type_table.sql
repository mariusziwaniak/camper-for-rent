CREATE TABLE payment_type (
  payment_type_id SERIAL      NOT NULL,
  description     VARCHAR(25) NOT NULL UNIQUE,
  PRIMARY KEY (payment_type_id));
COMMENT ON TABLE payment_type IS '1 - gotówka
2 - przelew bankowy
3 - szybki przelew
4 - blik';