package za.co.protogen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.protogen.model.Car;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Long> {
    List<Car> findByMake(String make);
    List<Car> findByYear(int year);
    List<Car> findByColor(String color);
}
