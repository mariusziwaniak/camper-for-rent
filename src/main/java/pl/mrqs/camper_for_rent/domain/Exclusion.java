package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.time.LocalDate;

@With
@Value
@Builder
@EqualsAndHashCode(of = "exclusionId")
@ToString(of = {"exclusionId", "startDate", "endDate"})
public class Exclusion {

    Integer exclusionId;
    LocalDate startDate;
    LocalDate endDate;
    Vehicle vehicle;

}
