package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "vehicleDetailId")
@ToString(of = {"vehicleDetailId", "description"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicleDetail")
public class VehicleDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_detail_id")
    private Integer vehicleDetailId;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private VehicleEntity vehicle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "detail_id")
    private DetailEntity detail;

}
