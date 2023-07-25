package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "exclusionId")
@ToString(of = {"exclusionId", "startDate", "endDate"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exclusion")
public class ExclusionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exclusion_id")
    private Integer exclusionId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private VehicleEntity vehicle;

}
