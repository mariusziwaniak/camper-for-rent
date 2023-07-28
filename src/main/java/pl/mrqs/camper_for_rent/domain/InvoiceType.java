package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "invoiceTypeId")
@ToString(of = {"invoiceTypeId", "invoiceType"})
public class InvoiceType {

    Integer invoiceTypeId;
    String invoiceType;
    Set<Invoice> invoices;

}
