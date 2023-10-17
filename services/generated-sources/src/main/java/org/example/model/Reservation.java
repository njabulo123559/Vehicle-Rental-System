package org.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "A reservation")
public class Reservation {

    @ApiModelProperty(value = "The unique identifier for the reservation")
    private String id;

    @ApiModelProperty(value = "User ID associated with the reservation")
    private String userId;

    @ApiModelProperty(value = "Car ID associated with the reservation")
    private String carId;

    @ApiModelProperty(value = "Pick-up date for the reservation")
    private String fromDate;

    @ApiModelProperty(value = "Drop-off date for the reservation")
    private String toDate;

    @ApiModelProperty(value = "Pick-up location for the reservation")
    private String pickUpLocation;

    @ApiModelProperty(value = "Drop-off location for the reservation")
    private String dropOffLocation;
}
