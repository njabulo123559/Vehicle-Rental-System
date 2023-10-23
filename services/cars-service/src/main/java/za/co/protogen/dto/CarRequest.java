package za.co.protogen.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.co.protogen.model.FuelType;
import za.co.protogen.model.TransmissionType;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarRequest {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private TransmissionType transmission;
    private FuelType fuelType;
    private int mileage;
    private double price;
    private int ownerId;
    private List<String> features;
}

