package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "paymentId")
@ToString(of = {"paymentId", "paymentDateTime", "amount"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "payment_date_time")
    private OffsetDateTime paymentDateTime;

    @Column(name = "amount")
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private InvoiceEntity invoice;

}
