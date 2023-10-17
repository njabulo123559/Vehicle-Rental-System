package za.co.protogen.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.protogen.core.CarService;
import za.co.protogen.domain.Car;
import za.co.protogen.persistence.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void removeCar(String carId) {
        carRepository.deleteById(Long.valueOf(carId));
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCarById(String carId) {
        return carRepository.findById(Long.valueOf(carId)).orElse(null);
    }

    @Override
    public void deleteCar(Long carId) {
        carRepository.deleteById(carId);
    }

    @Override
    public Car updateCar(String carId, Car updatedCar) {
        updatedCar.setVin(carId);
        return carRepository.save(updatedCar);
    }



    @Override
    public Car getCarById(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getCarsByMake(Car.Make make) {
        return carRepository.findByMake(make);
    }

    @Override
    public List<Car> getCarsByYear(int year) {
        return carRepository.findByYear(year);
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        return carRepository.findByColor(color);
    }

    @Override
    public Car updateCar(Long carId, Car updatedCar) {
        updatedCar.setOwnerId(Math.toIntExact(carId)); // Set the ID of the updated car
        return carRepository.save(updatedCar);
    }

    @Override
    public double calculateAverageMileage() {
        List<Car> cars = carRepository.findAll();
        if (cars.isEmpty()) {
            return 0.0;
        }

        int totalMileage = cars.stream()
                .mapToInt(Car::getMileage)
                .sum();

        return (double) totalMileage / cars.size();
    }

    @Override
    public Car findCheapestCar() {
        return carRepository.findFirstByOrderByPriceAsc();
    }

    @Override
    public Car findMostExpensiveCar() {
        return carRepository.findFirstByOrderByPriceDesc();
    }

    @Override
    public Car findNewestCar() {
        return carRepository.findFirstByOrderByYearDesc();
    }

    @Override
    public Car findOldestCar() {
        return carRepository.findFirstByOrderByYearAsc();
    }

    @Override
    public List<Car> searchCars(String make, String model, double minPrice, double maxPrice, int minYear, int maxYear) {
        return carRepository.findByMakeAndModelAndPriceBetweenAndYearBetween(
                make, model, minPrice, maxPrice, minYear, maxYear);
    }
}
