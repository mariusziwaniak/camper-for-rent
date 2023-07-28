package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "categoryId")
@ToString(of = {"categoryId", "categoryName"})
public class Category {

    Integer categoryId;
    String categoryName;
    Set<Vehicle> vehicles;

}
