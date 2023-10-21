package za.co.protogen.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import za.co.protogen.client.UserFeignClient;
import za.co.protogen.dto.ReservationRequest;
import za.co.protogen.dto.ReservationResponse;
import za.co.protogen.model.Reservation;
import za.co.protogen.model.User;
import za.co.protogen.repository.ReservationRepository;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final RestTemplate restTemplate;
    @Autowired
    private UserFeignClient userFeignClient;


    public void addReservation(ReservationRequest reservationRequest) throws UserNotFoundException {
            Reservation reservation = Reservation.builder()
                    .userId(reservationRequest.getUserId())
                    .carId(reservationRequest.getCarId())
                    .dropOffLocation(reservationRequest.getDropOffLocation())
                    .fromDate(reservationRequest.getFromDate())
                    .toDate(reservationRequest.getToDate())
                    .pickUpLocation(reservationRequest.getPickUpLocation())
                    .build();


        User user1 = userFeignClient.getUserById(reservationRequest.getUserId());

        if (user1 == null) {
            log.info("User with userId " + reservation.getUserId() + " not found");
            throw new IllegalStateException("User with userId " + reservation.getUserId() + " not found");
        }


            reservationRepository.save(reservation);

            log.info("Reservations {} is saved", reservation.getId());

        }


    public List<ReservationResponse> getAllReservations() {
        List<Reservation> cars = reservationRepository.findAll();

        return cars.stream().map(this::mapToCarsResponse).toList();
    }

    private ReservationResponse mapToCarsResponse(Reservation reservation) {
        return ReservationResponse.builder()
                .carId(reservation.getCarId())
                .userId(reservation.getUserId())
                .fromDate(reservation.getFromDate())
                .toDate(reservation.getToDate())
                .dropOffLocation(reservation.getDropOffLocation())
                .id(reservation.getId())
                .pickUpLocation(reservation.getPickUpLocation())
                .build();
    }

    public void removeReservation(Long id) {
        if(reservationRepository.existsById(id)){
            reservationRepository.deleteById(id);
            log.info("Reservation with ID {} has been deleted", id);
        }else{
            log.warn("Reservation with ID {} not found and cannot be deleted", id);
        }

    }

    public Reservation getReservationById(Long id){
        return reservationRepository.findById(id).orElse(null);
    }


    public void updateReservation(Long reservationId, ReservationRequest reservationRequest) throws ReservationNotFoundException {
        // First, check if the reservation with the given ID exists.
        Optional<Reservation> optionalReservation = reservationRepository.findById(reservationId);
        if (optionalReservation.isPresent()) {
            Reservation reservation = optionalReservation.get();

            // Update the reservation's attributes with the new values from the request.
            reservation.setFromDate(reservationRequest.getFromDate());
            reservation.setToDate(reservationRequest.getToDate());
            reservation.setDropOffLocation(reservationRequest.getDropOffLocation());
            reservation.setPickUpLocation(reservationRequest.getPickUpLocation());
           ;


            // Save the updated car.
            reservationRepository.save(reservation);

            log.info("Reservation {} is updated", reservation.getId());
        } else {
            // Handle the case where the reservation with the given ID doesn't exist.
            throw new ReservationNotFoundException("Reservation with ID " + reservationId + " not found");
        }
    }










}
