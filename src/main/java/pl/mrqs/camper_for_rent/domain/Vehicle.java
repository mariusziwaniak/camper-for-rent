package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "vehicleId")
@ToString(of = {"vehicleId", "brand", "model", "year"})
public class Vehicle {

    Integer vehicleId;
    String brand;
    String model;
    Integer year;
    Category category;
    Owner owner;
    Set<VehicleDetail> details;
    Set<Exclusion> exclusions;
    Set<Price> prices;
    Set<Booking> bookings;

}
