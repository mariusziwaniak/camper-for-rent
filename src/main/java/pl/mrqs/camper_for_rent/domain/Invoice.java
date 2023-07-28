package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "invoiceId")
@ToString(of = {"invoiceId", "invoiceNumber", "invoiceDateTime", "amount"})
public class Invoice {

    Integer invoiceId;
    String invoiceNumber;
    OffsetDateTime invoiceDateTime;
    BigDecimal amount;
    Booking booking;
    InvoiceType invoiceType;
    PaymentType paymentType;
    Payment payment;

}
