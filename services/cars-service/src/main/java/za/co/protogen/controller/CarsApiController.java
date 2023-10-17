package za.co.protogen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.protogen.core.CarService;
import za.co.protogen.domain.Car;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsApiController {

    @Autowired
    private CarService carService;

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER')")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{carId}")
    public Car getCarById(@PathVariable Long carId) {
        return carService.getCarById(String.valueOf(carId));
    }

    @PostMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Car createCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @PutMapping("/{carId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Car updateCar(@PathVariable Long carId, @RequestBody Car updatedCar) {
        return carService.updateCar(String.valueOf(carId), updatedCar);
    }

    @DeleteMapping("/{carId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteCar(@PathVariable Long carId) {
        carService.removeCar(String.valueOf(carId));
    }
}
