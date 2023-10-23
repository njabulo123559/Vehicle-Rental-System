package za.co.protogen.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.protogen.dto.CarRequest;
import za.co.protogen.dto.CarResponse;
import za.co.protogen.model.Car;
import za.co.protogen.service.CarNotFoundException;
import za.co.protogen.service.CarService;

import java.util.List;
@Api(value = "Car Management API", tags ="Cars")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cars")
public class CarController {


    private final CarService carService;

    @ApiOperation(value = "Create a new car")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createCar(@RequestBody List<CarRequest> carRequest){
        for (CarRequest carRequest1 : carRequest){
            carService.createCar(carRequest1);
        }
        return "Car Created Successfully";

    }

    @ApiOperation(value = "Get a list of all cars")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CarResponse> getAllCars(){
       return  carService.getAllCars();

    }
    @ApiOperation("Delete a car")
    @DeleteMapping("/{vin}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteCar(@PathVariable Long vin){
        carService.deleteCar(vin);
        return "Car Deleted Successfully";
    }
    @ApiOperation(value = "Get a car by VIN")
    @GetMapping("/{vin}")
    public ResponseEntity<Car> getCarById(@PathVariable Long vin){

        if(carService.getCarById(vin) != null){
            return ResponseEntity.ok(carService.getCarById(vin));
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @ApiOperation(value = "Get a car by make")
    @GetMapping("/by-make")
    @ResponseStatus(HttpStatus.OK)
    public List<CarResponse> getCarsByMake(@RequestParam("make") String make){
        return carService.getCarsByMake(make);
    }

    @ApiOperation(value = "Get cars by year")
    @GetMapping("/by-year")
    @ResponseStatus(HttpStatus.OK)
    public List<CarResponse> getCarsByYear(@RequestParam("year") int year) {
        return carService.getCarsByYear(year);
    }

    @ApiOperation(value = "Get cars by color")
    @GetMapping("/by-color")
    @ResponseStatus(HttpStatus.OK)
    public List<CarResponse> getCarsByColor(@RequestParam("color") String color) {
        return carService.getCarsByColor(color);
    }

    @ApiOperation(value = "Update car")
    @PutMapping("/{carId}")
    @ResponseStatus(HttpStatus.OK)
    public String updateCar(@PathVariable Long carId, @RequestBody CarRequest carRequest) throws CarNotFoundException {
        carService.updateCar(carId, carRequest);
        return "Car Updated Successfully";
    }

    @ApiOperation(value = "Calculate average mileage")
    @GetMapping("/average-mileage")
    @ResponseStatus(HttpStatus.OK)
    public double calculateAverageMileage() throws CarNotFoundException {
        return carService.calculateAverageMileage();
    }

    @ApiOperation("Find cheapest car")
    @GetMapping("/cheapest-car")
    @ResponseStatus(HttpStatus.OK)
    public CarResponse findCheapestCar() throws CarNotFoundException {
        return carService.findCheapestCar();
    }

    @ApiOperation("Find most expensive car")
    @GetMapping("/most-expensive-car")
    @ResponseStatus(HttpStatus.OK)
    public CarResponse findMostExpensiveCar() throws CarNotFoundException {
        return carService.findMostExpensiveCar();
    }

    @ApiOperation(value = "Find newest car")
    @GetMapping("/newest-car")
    @ResponseStatus(HttpStatus.OK)
    public CarResponse findNewestCar() throws CarNotFoundException {
        return carService.findNewestCar();
    }

    @ApiOperation(value = "Find oldest car")
    @GetMapping("/oldest-car")
    @ResponseStatus(HttpStatus.OK)
    public CarResponse findOldestCar() throws CarNotFoundException {
        return carService.findOldestCar();
    }





}
