package org.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "A vehicle")
public class Car {

    @ApiModelProperty(value = "The unique identifier for the vehicle")
    private String id;

    @ApiModelProperty(value = "Make of the vehicle")
    private String make;

    @ApiModelProperty(value = "Model of the vehicle")
    private String model;

    @ApiModelProperty(value = "Year of the vehicle")
    private Integer year;

    @ApiModelProperty(value = "Color of the vehicle")
    private String color;

    @ApiModelProperty(value = "Engine type of the vehicle")
    private String engine;

    @ApiModelProperty(value = "Transmission type of the vehicle")
    private String transmission;

    @ApiModelProperty(value = "Price of the vehicle")
    private Double price;

    @ApiModelProperty(value = "VIN (Vehicle Identification Number) of the vehicle")
    private String vin;

    @ApiModelProperty(value = "Owner ID of the vehicle")
    private Integer ownerId;

    @ApiModelProperty(value = "Fuel type of the vehicle")
    private String fuelType;
}
