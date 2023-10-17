package za.co.protogen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.protogen.core.ReservationService;
import za.co.protogen.domain.Reservation;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class reservationsApiController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER')")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{reservationId}")
    public Reservation getReservationById(@PathVariable Long reservationId) {
        return reservationService.getReservationById(Long.valueOf(String.valueOf(reservationId)));
    }

    @PostMapping
    @PreAuthorize("hasRole('ROLE_USER')")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/{reservationId}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public Reservation updateReservation(@PathVariable Long reservationId, @RequestBody Reservation updatedReservation) {
        return reservationService.updateReservation(Long.valueOf(String.valueOf(reservationId)), updatedReservation);
    }

    @DeleteMapping("/{reservationId}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public void deleteReservation(@PathVariable Long reservationId) {
        reservationService.removeReservation(Long.valueOf(String.valueOf(reservationId)));
    }
}
