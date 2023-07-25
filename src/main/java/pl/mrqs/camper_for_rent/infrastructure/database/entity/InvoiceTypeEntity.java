package pl.mrqs.camper_for_rent.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "invoiceTypeId")
@ToString(of = {"invoiceTypeId", "invoiceType"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoice_type")
public class InvoiceTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_type_id")
    private Integer invoiceTypeId;

    @Column(name = "invoice_type", unique = true)
    private String invoiceType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "invoiceType")
    private Set<InvoiceEntity> invoices;

}
