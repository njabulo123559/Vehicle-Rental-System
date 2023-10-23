package za.co.protogen.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import za.co.protogen.dto.CarRequest;
import za.co.protogen.dto.CarResponse;
import za.co.protogen.model.Car;
import za.co.protogen.repository.CarsRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
@Slf4j
public class CarService {

    private final CarsRepository carRepository;

    public void createCar(CarRequest carRequest){
        Car car = Car.builder()
                .color(carRequest.getColor())
                .make(carRequest.getMake())
                .price(carRequest.getPrice())
                .engine(carRequest.getEngine())
                .model(carRequest.getModel())
                .year(carRequest.getYear())
                .ownerId(carRequest.getOwnerId())
                .mileage(carRequest.getMileage())
                .fuelType(carRequest.getFuelType())
                .features(carRequest.getFeatures())
                .transmission(carRequest.getTransmission())
                .build();

        carRepository.save(car);

        log.info("Car {} is saved", car.getVin());
    }

    public List<CarResponse> getAllCars() {
        List<Car> cars = carRepository.findAll();

         return cars.stream().map(this::mapToCarsResponse).collect(Collectors.toList());
    }

    private CarResponse mapToCarsResponse(Car car) {
        return CarResponse.builder()
                .vin(car.getVin())
                .color(car.getColor())
                .make(car.getMake())
                .price(car.getPrice())
                .engine(car.getEngine())
                .model(car.getModel())
                .year(car.getYear())
                .ownerId(car.getOwnerId())
                .mileage(car.getMileage())
                .fuelType(car.getFuelType())
                .features(car.getFeatures())
                .transmission(car.getTransmission())
                .build();



    }

    public void deleteCar(Long vin) {
        if(carRepository.existsById(vin)){
            carRepository.deleteById(vin);
            log.info("Car with VIN {} has been deleted", vin);
        }else{
            log.warn("Car with VIN {} not found and cannot be deleted", vin);
        }

    }

    public Car getCarById(Long vin){
        return carRepository.findById(vin).orElse(null);
    }

    public List<CarResponse> getCarsByMake(String make) {
        List<Car> cars = carRepository.findByMake(make);
        return cars.stream().map(this::mapToCarsResponse).collect(Collectors.toList());
    }


    public List<CarResponse> getCarsByYear(int year) {
        List<Car> cars = carRepository.findByYear(year);
        return cars.stream().map(this::mapToCarsResponse).collect(Collectors.toList());
    }

    public List<CarResponse> getCarsByColor(String color) {
        List<Car> cars = carRepository.findByColor(color);
        return cars.stream().map(this::mapToCarsResponse).collect(Collectors.toList());
    }

    public void updateCar(Long carId, CarRequest carRequest) throws CarNotFoundException {
        // First, check if the car with the given ID exists.
        Optional<Car> optionalCar = carRepository.findById(carId);
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();

            // Update the car's attributes with the new values from the request.
            car.setColor(carRequest.getColor());
            car.setMake(carRequest.getMake());
            car.setPrice(carRequest.getPrice());
            car.setEngine(carRequest.getEngine());
            car.setModel(carRequest.getModel());
            car.setYear(carRequest.getYear());
            car.setOwnerId(carRequest.getOwnerId());
            car.setMileage(carRequest.getMileage());
            car.setFuelType(carRequest.getFuelType());
            car.setFeatures(carRequest.getFeatures());
            car.setTransmission(carRequest.getTransmission());

            // Save the updated car.
            carRepository.save(car);

            log.info("Car {} is updated", car.getVin());
        } else {
            // Handle the case where the car with the given ID doesn't exist.
            throw new CarNotFoundException("Car with ID " + carId + " not found");
        }
    }

    public double calculateAverageMileage() throws CarNotFoundException {
        List<Car> cars = carRepository.findAll();

        if (cars.isEmpty()) {
            // Handle the case where there are no cars in the service.
            throw new CarNotFoundException("No cars found in the service");
        }

        double totalMileage = cars.stream()
                .mapToDouble(Car::getMileage)
                .sum();

        return totalMileage / cars.size();
    }

    public CarResponse findCheapestCar() throws CarNotFoundException {
        List<Car> cars = carRepository.findAll();

        if (cars.isEmpty()) {
            // Handle the case where there are no cars in the service.
            throw new CarNotFoundException("No cars found in the service");
        }

        Car cheapestCar = cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElseThrow(() -> new CarNotFoundException("No cars found in the service"));

        return mapToCarsResponse(cheapestCar);
    }


    public CarResponse findMostExpensiveCar() throws CarNotFoundException {
        List<Car> cars = carRepository.findAll();

        if (cars.isEmpty()) {
            // Handle the case where there are no cars in the service.
            throw new CarNotFoundException("No cars found in the service");
        }

        Car mostExpensiveCar = cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .orElseThrow(() -> new CarNotFoundException("No cars found in the service"));

        return mapToCarsResponse(mostExpensiveCar);
    }

    public CarResponse findNewestCar() throws CarNotFoundException {
        List<Car> cars = carRepository.findAll();

        if (cars.isEmpty()) {
            // Handle the case where there are no cars in the service.
            throw new CarNotFoundException("No cars found in the service");
        }

        Car newestCar = cars.stream()
                .max(Comparator.comparingInt(Car::getYear))
                .orElseThrow(() -> new CarNotFoundException("No cars found in the service"));

        return mapToCarsResponse(newestCar);
    }

    public CarResponse findOldestCar() throws CarNotFoundException {
        List<Car> cars = carRepository.findAll();

        if (cars.isEmpty()) {
            // Handle the case where there are no cars in the service.
            throw new CarNotFoundException("No cars found in the service");
        }

        Car oldestCar = cars.stream()
                .min(Comparator.comparingInt(Car::getYear))
                .orElseThrow(() -> new CarNotFoundException("No cars found in the service"));

        return mapToCarsResponse(oldestCar);
    }


















}
