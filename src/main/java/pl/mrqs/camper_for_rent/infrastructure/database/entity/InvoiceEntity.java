package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "invoiceId")
@ToString(of = {"invoiceId", "invoiceNumber", "invoiceDateTime", "amount"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoice")
public class InvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Integer invoiceId;

    @Column(name = "invoice_number", unique = true)
    private String invoiceNumber;

    @Column(name = "invoice_date_time")
    private OffsetDateTime invoiceDateTime;

    @Column(name = "amount")
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private BookingEntity booking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_type_id")
    private InvoiceTypeEntity invoiceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_type_id")
    private PaymentTypeEntity paymentType;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "invoice")
    private PaymentEntity payment;

}
