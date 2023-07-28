package pl.mrqs.camper_for_rent.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.BookingEntity;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.CategoryEntity;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Integer> {
}
