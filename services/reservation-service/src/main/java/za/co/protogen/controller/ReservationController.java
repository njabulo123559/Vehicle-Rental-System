package za.co.protogen.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.protogen.dto.ReservationRequest;
import za.co.protogen.dto.ReservationResponse;
import za.co.protogen.model.Reservation;
import za.co.protogen.service.ReservationNotFoundException;
import za.co.protogen.service.ReservationService;
import za.co.protogen.service.UserNotFoundException;

import java.util.List;

@Api(value = "Reservation Management API", tags = "Reservations")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    @ApiOperation(value = "Create a new reservation")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addReservation(@RequestBody List<ReservationRequest> reservationRequest) throws UserNotFoundException {
        for (ReservationRequest reservationRequest1 : reservationRequest) {
            reservationService.addReservation(reservationRequest1);
        }
        return "Reservation Created Successfully";
    }

    @ApiOperation(value = "Get a list of all reservations")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ReservationResponse> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @ApiOperation(value = "Delete a reservation by ID")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String removeReservation(@PathVariable Long id) {
        reservationService.removeReservation(id);
        return "Reservation Deleted Successfully";
    }

    @ApiOperation(value = "Get a reservation by ID")
    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id) {
        if (reservationService.getReservationById(id) != null) {
            return ResponseEntity.ok(reservationService.getReservationById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "Update a reservation by ID")
    @PutMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public String updateReservation(@PathVariable Long reservationId, @RequestBody ReservationRequest reservationRequest) throws ReservationNotFoundException {
        reservationService.updateReservation(reservationId, reservationRequest);
        return "Reservation Updated Successfully";
    }
}
