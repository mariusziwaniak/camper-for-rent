package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "bookingId")
@ToString(of = {"bookingId", "bookingDateTime", "startDate", "endDate", "price", "status"})
public class Booking {

    Integer bookingId;
    OffsetDateTime bookingDateTime;
    LocalDate startDate;
    LocalDate endDate;
    BigDecimal price;
    Integer status;
    Vehicle vehicle;
    Customer customer;
    Set<Invoice> invoices;

}
