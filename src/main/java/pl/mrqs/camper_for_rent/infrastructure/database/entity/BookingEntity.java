package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "bookingId")
@ToString(of = {"bookingId", "bookingDateTime", "startDate", "endDate", "price", "status"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "booking_date_time")
    private OffsetDateTime bookingDateTime;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "status")
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private VehicleEntity vehicle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "booking")
    private Set<InvoiceEntity> invoices;

}
