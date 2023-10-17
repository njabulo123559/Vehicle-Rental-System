package za.co.protogen.core;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.protogen.domain.Reservation;

import java.time.LocalDate;
import java.util.List;
@FeignClient(name = "reservation-service")
public interface ReservationService {
    @GetMapping("/reservation")
    Reservation addReservation(Reservation reservation);
    void removeReservation(Long reservationId);
    Reservation getReservationById(Long reservationId);
    List<Reservation> getAllReservations();
    Reservation updateReservation(Long reservationId, Reservation updatedReservation);
    List<Reservation> searchReservations(Long userId, Long carId, LocalDate fromDate, LocalDate toDate);

    void deleteReservation(Long reservationId);


    Reservation createReservation(Reservation reservation);
}
