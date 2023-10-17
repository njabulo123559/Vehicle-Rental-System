package za.co.protogen.persistence;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car implements Serializable {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vin; // Primary key

    // Getters and Setters
    @Getter
    private za.co.protogen.domain.Car.Make make;
    @Getter
    private String model;
    @Getter
    private int year;
    @Getter
    private String color;
    @Getter
    private String engine;
    @Getter
    private za.co.protogen.domain.Car.TransmissionType transmission;
    @Getter
    private za.co.protogen.domain.Car.FuelType fuelType;
    @Getter
    private int mileage;
    @Getter
    private double price;
    private Long ownerId;
    @Getter
    private List<String> features;

    public enum Make {
        TOYOTA,
        HONDA,
        FORD,
        CHEVROLET,
        BMW,
        AUDI,
        MERCEDES,
        VOLKSWAGEN,
        OTHER
    }

    public enum FuelType {
        GASOLINE, DIESEL, ELECTRIC, HYBRID, OTHER
    }

    // Enum for Transmission Type
    public enum TransmissionType {
        MANUAL, AUTOMATIC, CVT, DCT, OTHER
    }

    public Car(){}

    public Car(za.co.protogen.domain.Car.Make make, String model, int year, String color, String engine, za.co.protogen.domain.Car.TransmissionType transmission,
               za.co.protogen.domain.Car.FuelType fuelType, int mileage, String vin, double price, int ownerId, List<String> features){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.vin = vin;
        this.price = price;
        this.ownerId = (long) ownerId;
        this.features = features;

    }


    public void setMake(za.co.protogen.domain.Car.Make make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(za.co.protogen.domain.Car.TransmissionType transmission) {
        this.transmission = transmission;
    }

    public void setFuelType(za.co.protogen.domain.Car.FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }








}
