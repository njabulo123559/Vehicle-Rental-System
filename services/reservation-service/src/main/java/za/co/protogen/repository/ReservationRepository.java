package za.co.protogen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.protogen.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
