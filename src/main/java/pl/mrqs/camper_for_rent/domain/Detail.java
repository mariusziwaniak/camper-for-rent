package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "detailId")
@ToString(of = {"detailId", "detailName"})
public class Detail {

    Integer detailId;
    String detailName;
    Set<VehicleDetail> vehicleDetails;

}
