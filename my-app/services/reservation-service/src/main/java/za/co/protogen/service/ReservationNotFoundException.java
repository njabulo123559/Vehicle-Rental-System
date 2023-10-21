package za.co.protogen.service;

import za.co.protogen.dto.ReservationResponse;

public class ReservationNotFoundException extends Throwable {
    public ReservationNotFoundException(String message) {
        super(message);
    }
}