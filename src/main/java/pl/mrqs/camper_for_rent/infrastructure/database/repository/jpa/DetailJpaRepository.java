package pl.mrqs.camper_for_rent.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.CustomerEntity;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.DetailEntity;

public interface DetailJpaRepository extends JpaRepository<DetailEntity, Integer> {
}
