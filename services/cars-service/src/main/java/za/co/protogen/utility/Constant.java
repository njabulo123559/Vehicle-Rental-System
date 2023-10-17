package za.co.protogen.utility;

import java.util.ArrayList;
import java.util.List;

import za.co.protogen.domain.Car;

public class Constant {

    public static List<Car> cars = new ArrayList<>();
    static {
        //Add mock data
        Car car1 = new Car();
        car1.setMake(Car.Make.valueOf("Toyota"));
        car1.setModel("Corolla");
        car1.setYear(2021);
        car1.setColor("White");
        car1.setEngine("1.8L");
        car1.setTransmission(Car.TransmissionType.valueOf("Automatic"));
        car1.setFuelType(Car.FuelType.valueOf("Gasoline"));
        car1.setMileage(10000);
        car1.setVin("ABC123");
        car1.setPrice(25000);
        car1.setOwnerId(123);
        car1.setFeatures(new ArrayList<>());
        cars.add(car1);

        Car car2 = new Car();
        car2.setMake(Car.Make.valueOf("Honda"));
        car2.setModel("Civic");
        car2.setYear(2020);
        car2.setColor("Red");
        car2.setEngine("1.5L");
        car2.setTransmission(Car.TransmissionType.valueOf("CVT"));
        car2.setFuelType(Car.FuelType.valueOf("Gasoline"));
        car2.setMileage(15000);
        car2.setVin("XYZ789");
        car2.setPrice(22000);
        car2.setOwnerId(456);
        car2.setFeatures(new ArrayList<>());
        cars.add(car2);





    }
}
