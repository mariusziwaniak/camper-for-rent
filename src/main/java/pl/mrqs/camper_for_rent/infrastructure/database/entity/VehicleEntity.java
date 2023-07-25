package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "vehicleId")
@ToString(of = {"vehicleId", "brand", "model", "year"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Integer vehicleId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Integer year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private OwnerEntity owner;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
    private Set<VehicleDetailEntity> details;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
    private Set<ExclusionEntity> exclusions;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
    private Set<PriceEntity> prices;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
    private Set<BookingEntity> bookings;

}
