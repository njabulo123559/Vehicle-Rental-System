package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.CarRequest;
import io.swagger.model.CarResponse;
import io.swagger.model.ReservationRequest;
import io.swagger.model.ReservationResponse;
import io.swagger.model.UserRequest;
import io.swagger.model.UserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-19T18:37:39.108177982Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addReservation(@Parameter(in = ParameterIn.DEFAULT, description = "List of reservation requests", required=true, schema=@Schema()) @Valid @RequestBody List<ReservationRequest> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "List of user requests", required=true, schema=@Schema()) @Valid @RequestBody List<UserRequest> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BigDecimal> calculateAverageMileage() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BigDecimal>(objectMapper.readValue("0.8008281904610115", BigDecimal.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BigDecimal>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BigDecimal>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createCar(@Parameter(in = ParameterIn.DEFAULT, description = "List of car requests", required=true, schema=@Schema()) @Valid @RequestBody List<CarRequest> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCar(@Parameter(in = ParameterIn.PATH, description = "VIN of the car", required=true, schema=@Schema()) @PathVariable("vin") Integer vin) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CarResponse> findCheapestCar() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CarResponse>(objectMapper.readValue("{\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}", CarResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CarResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CarResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CarResponse> findMostExpensiveCar() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CarResponse>(objectMapper.readValue("{\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}", CarResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CarResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CarResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CarResponse> findNewestCar() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CarResponse>(objectMapper.readValue("{\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}", CarResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CarResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CarResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CarResponse> findOldestCar() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CarResponse>(objectMapper.readValue("{\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}", CarResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CarResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CarResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CarResponse>> getAllCars() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CarResponse>>(objectMapper.readValue("[ {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}, {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CarResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CarResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ReservationResponse>> getAllReservations() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ReservationResponse>>(objectMapper.readValue("[ {\n  \"fromDate\" : \"2000-01-23\",\n  \"toDate\" : \"2000-01-23\",\n  \"dropoffLocation\" : \"dropoffLocation\",\n  \"id\" : 0,\n  \"userId\" : 6,\n  \"pickUpLocation\" : \"pickUpLocation\",\n  \"carId\" : 1\n}, {\n  \"fromDate\" : \"2000-01-23\",\n  \"toDate\" : \"2000-01-23\",\n  \"dropoffLocation\" : \"dropoffLocation\",\n  \"id\" : 0,\n  \"userId\" : 6,\n  \"pickUpLocation\" : \"pickUpLocation\",\n  \"carId\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ReservationResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ReservationResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserResponse>> getAllUsers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserResponse>>(objectMapper.readValue("[ {\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"rsaId\" : \"rsaId\",\n  \"dateOfBirth\" : \"dateOfBirth\",\n  \"id\" : 0\n}, {\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"rsaId\" : \"rsaId\",\n  \"dateOfBirth\" : \"dateOfBirth\",\n  \"id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CarResponse> getCarById(@Parameter(in = ParameterIn.PATH, description = "VIN of the car", required=true, schema=@Schema()) @PathVariable("vin") Integer vin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CarResponse>(objectMapper.readValue("{\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}", CarResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CarResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CarResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CarResponse>> getCarsByColor(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Color of the car" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "color", required = true) String color) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CarResponse>>(objectMapper.readValue("[ {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}, {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CarResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CarResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CarResponse>> getCarsByMake(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Make of the car" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "make", required = true) String make) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CarResponse>>(objectMapper.readValue("[ {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}, {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CarResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CarResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CarResponse>> getCarsByYear(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Year of the car" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "year", required = true) Integer year) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CarResponse>>(objectMapper.readValue("[ {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n}, {\n  \"features\" : [ \"features\", \"features\" ],\n  \"transmission\" : \"transmission\",\n  \"color\" : \"color\",\n  \"fuelType\" : \"fuelType\",\n  \"year\" : 6,\n  \"engine\" : \"engine\",\n  \"price\" : 5.962133916683182,\n  \"vin\" : 0,\n  \"model\" : \"model\",\n  \"ownerId\" : 5,\n  \"make\" : \"make\",\n  \"mileage\" : 1.4658129805029452\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CarResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CarResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReservationResponse> getReservationById(@Parameter(in = ParameterIn.PATH, description = "ID of the reservation", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReservationResponse>(objectMapper.readValue("{\n  \"fromDate\" : \"2000-01-23\",\n  \"toDate\" : \"2000-01-23\",\n  \"dropoffLocation\" : \"dropoffLocation\",\n  \"id\" : 0,\n  \"userId\" : 6,\n  \"pickUpLocation\" : \"pickUpLocation\",\n  \"carId\" : 1\n}", ReservationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReservationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReservationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserResponse> getUserById(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserResponse>(objectMapper.readValue("{\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"rsaId\" : \"rsaId\",\n  \"dateOfBirth\" : \"dateOfBirth\",\n  \"id\" : 0\n}", UserResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeReservation(@Parameter(in = ParameterIn.PATH, description = "ID of the reservation", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeUser(@Parameter(in = ParameterIn.PATH, description = "ID of the user", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCar(@Parameter(in = ParameterIn.PATH, description = "ID of the car", required=true, schema=@Schema()) @PathVariable("carId") Integer carId,@Parameter(in = ParameterIn.DEFAULT, description = "Car request", required=true, schema=@Schema()) @Valid @RequestBody CarRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateReservation(@Parameter(in = ParameterIn.PATH, description = "ID of the reservation to update", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "Reservation request", required=true, schema=@Schema()) @Valid @RequestBody ReservationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH, description = "ID of the user to update", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "User request", required=true, schema=@Schema()) @Valid @RequestBody UserRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
