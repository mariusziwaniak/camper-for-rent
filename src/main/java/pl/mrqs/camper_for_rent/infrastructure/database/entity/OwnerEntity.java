package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "ownerId")
@ToString(of = {"ownerId", "company", "nip", "name", "surname", "phone", "email"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owner")
public class OwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "company", unique = true)
    private String company;

    @Column(name = "nip", unique = true)
    private String nip;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
    private Set<VehicleEntity> vehicles;

}
