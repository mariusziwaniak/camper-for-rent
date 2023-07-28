package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "paymentTypeId")
@ToString(of = {"paymentTypeId", "paymentType"})
public class PaymentType {

    Integer paymentTypeId;
    String paymentType;
    Set<Invoice> invoices;

}
