package za.co.protogen.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "vin")
    private Long vin;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private int year;
    @Column(name = "color")
    private String color;
    @Column(name = "engine")
    private String engine;
    @Column(name = "transmission")
    private TransmissionType transmission;
    @Column(name = "fuelType")
    private FuelType fuelType;
    @Column(name = "mileage")
    private int mileage;
    @Column(name = "price")
    private double price;
    @Column(name = "ownerId")
    private int ownerId;
    @ElementCollection
    @CollectionTable(name = "car_features")
    @Column(name = "feature")
    private List<String> features;
}

