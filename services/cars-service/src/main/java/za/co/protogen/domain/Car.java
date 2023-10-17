package za.co.protogen.domain;
import java.util.List;

public class Car {
    private Make make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private TransmissionType transmission;
    private FuelType fuelType;
    private int mileage;
    private String vin;
    private double price;
    private int ownerId;
    private List<String> features;



    //Constructor
    public Car(Make make, String model, int year, String color, String engine, TransmissionType transmission,
               FuelType fuelType, int mileage, String vin, double price, int ownerId, List<String> features){
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
        this.ownerId = ownerId;
        this.features = features;

    }

    public Car(){

    }



    // Enum for Car Make
    public enum Make {
        TOYOTA, HONDA, FORD, BMW, MERCEDES, CHEVROLET, VOLKSWAGEN, OTHER
    }

    // Enum for Fuel Type
    public enum FuelType {
        GASOLINE, DIESEL, ELECTRIC, HYBRID, OTHER
    }

    // Enum for Transmission Type
    public enum TransmissionType {
        MANUAL, AUTOMATIC, CVT, DCT, OTHER
    }



    // Getters and Setters
    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }











}
