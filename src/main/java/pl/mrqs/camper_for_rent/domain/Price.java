package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@With
@Value
@Builder
@EqualsAndHashCode(of = "priceId")
@ToString(of = {"priceId", "startDate", "endDate", "price"})
public class Price {

    Integer priceId;
    LocalDate startDate;
    LocalDate endDate;
    BigDecimal price;
    Vehicle vehicle;

}
