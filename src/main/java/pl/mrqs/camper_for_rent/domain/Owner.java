package pl.mrqs.camper_for_rent.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "ownerId")
@ToString(of = {"ownerId", "company", "nip", "name", "surname", "phone", "email"})
public class Owner {

    Integer ownerId;
    String company;
    String nip;
    String name;
    String surname;
    String phone;
    String email;
    Address address;
    Set<Vehicle> vehicles;

}
