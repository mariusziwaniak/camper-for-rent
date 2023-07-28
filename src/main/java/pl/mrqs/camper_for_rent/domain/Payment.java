package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "paymentId")
@ToString(of = {"paymentId", "paymentDateTime", "amount"})
public class Payment {

    Integer paymentId;
    OffsetDateTime paymentDateTime;
    BigDecimal amount;
    Invoice invoice;

}
