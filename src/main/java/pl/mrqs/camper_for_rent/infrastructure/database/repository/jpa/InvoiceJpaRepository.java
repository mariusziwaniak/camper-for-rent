package pl.mrqs.camper_for_rent.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.DetailEntity;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.InvoiceEntity;

public interface InvoiceJpaRepository extends JpaRepository<InvoiceEntity, Integer> {
}
