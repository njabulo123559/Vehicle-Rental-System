package org.example.api;

import org.example.model.Car;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Api(value = "Car")
public interface CarApi {

    @ApiOperation(value = "Get a list of vehicles")
    @GetMapping("/cars")
    List<Car> getCars();

    @ApiOperation(value = "Get a specific vehicle by ID")
    @GetMapping("/cars/{carId}")
    Car getCarById(@PathVariable("carId") String carId);
}
