package pl.mrqs.camper_for_rent.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.CategoryEntity;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.CustomerEntity;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Integer> {
}
