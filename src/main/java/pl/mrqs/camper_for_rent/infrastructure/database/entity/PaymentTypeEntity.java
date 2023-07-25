package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "paymentTypeId")
@ToString(of = {"paymentTypeId", "paymentType"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment_type")
public class PaymentTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_type_id")
    private Integer paymentTypeId;

    @Column(name = "payment_type", unique = true)
    private String paymentType;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "paymentType")
    private Set<InvoiceEntity> invoices;

}
