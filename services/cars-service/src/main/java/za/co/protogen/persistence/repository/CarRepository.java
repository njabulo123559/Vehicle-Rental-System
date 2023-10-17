package za.co.protogen.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.co.protogen.domain.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByMake(Car.Make make);
    List<Car> findByYear(int year);
    List<Car> findByColor(String color);

    Car findFirstByOrderByPriceAsc();
    Car findFirstByOrderByPriceDesc();
    Car findFirstByOrderByYearAsc();
    Car findFirstByOrderByYearDesc();

    @Query("SELECT c FROM Car c " +
            "WHERE c.make = :make " +
            "AND c.model = :model " +
            "AND c.price BETWEEN :minPrice AND :maxPrice " +
            "AND c.year BETWEEN :minYear AND :maxYear")
    List<Car> findByMakeAndModelAndPriceBetweenAndYearBetween(String make, String model, double minPrice, double maxPrice, int minYear, int maxYear);
}
