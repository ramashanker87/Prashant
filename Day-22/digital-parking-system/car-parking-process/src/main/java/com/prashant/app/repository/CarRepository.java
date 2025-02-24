package com.prashant.app.repository;


import com.prashant.app.module.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
    Car findByRegistrationNumber(String parkingNumber);
}
