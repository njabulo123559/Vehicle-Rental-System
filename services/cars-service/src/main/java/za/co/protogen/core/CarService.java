package za.co.protogen.core;

import za.co.protogen.domain.Car;

import java.util.List;

public interface CarService {
    Car addCar(Car car);
    void removeCar(String carId);
    Car getCarById(String carId);

    Car createCar(Car car);

    void deleteCar(Long carId);

    Car getCarById(Long carId);

    List<Car> getAllCars();
    List<Car> getCarsByMake(Car.Make make);
    List<Car> getCarsByYear(int year);
    List<Car> getCarsByColor(String color);
    Car updateCar(String carId, Car updatedCar);

    Car updateCar(Long carId, Car updatedCar);

    double calculateAverageMileage();
    Car findCheapestCar();
    Car findMostExpensiveCar();
    Car findNewestCar();
    Car findOldestCar();
    List<Car> searchCars(String make, String model, double minPrice, double maxPrice, int minYear, int maxYear);


}
