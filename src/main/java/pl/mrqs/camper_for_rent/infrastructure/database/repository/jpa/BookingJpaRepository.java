package pl.mrqs.camper_for_rent.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.AddressEntity;
import pl.mrqs.camper_for_rent.infrastructure.database.entity.BookingEntity;

public interface BookingJpaRepository extends JpaRepository<BookingEntity, Integer> {
}
