package za.co.protogen.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.protogen.core.ReservationService;
import za.co.protogen.domain.Reservation;
import za.co.protogen.persistence.repository.ReservationRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        return reservation;
    }

    @Override
    public void removeReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation getReservationById(Long reservationId) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(reservationId);
        return optionalReservation.orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Long reservationId, Reservation updatedReservation) {
        if (reservationRepository.existsById(reservationId)) {
            updatedReservation.setId(reservationId);
            return reservationRepository.save(updatedReservation);
        }
        return null;
    }

    @Override
    public List<Reservation> searchReservations(Long userId, Long carId, LocalDate fromDate, LocalDate toDate) {
        // Implement the search logic based on criteria
        return null;
    }

    @Override
    public void deleteReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        // Generate a unique ID for the new reservation
        Long newReservationId = generateUniqueReservationId();

        // Set the generated ID to the reservation
        reservation.setId(newReservationId);

        // Save the new reservation to the database
        return reservationRepository.save(reservation);
    }

    // Helper method to generate a unique ID for a new reservation
    private Long generateUniqueReservationId() {
        // Implement the unique ID generation logic
        return null;
    }
}
