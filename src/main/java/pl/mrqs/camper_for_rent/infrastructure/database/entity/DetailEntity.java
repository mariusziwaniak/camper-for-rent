package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "detailId")
@ToString(of = {"detailId", "detailName"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detail")
public class DetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Integer detailId;

    @Column(name = "detail_name")
    private String detailName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail")
    private Set<VehicleDetailEntity> vehicleDetails;
}
