package org.example.api;

import org.example.model.Reservation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "Reservation")
public interface ReservationApi {

    @ApiOperation(value = "Create a new reservation")
    @PostMapping("/reservations")
    Reservation createReservation(@RequestBody Reservation reservation);
}
