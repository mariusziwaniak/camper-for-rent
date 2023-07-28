package pl.mrqs.camper_for_rent.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "vehicleDetailId")
@ToString(of = {"vehicleDetailId", "description"})
public class VehicleDetail {

    Integer vehicleDetailId;
    String description;
    Vehicle vehicle;
    Detail detail;

}
