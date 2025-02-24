package com.prashant.app.repository;

import com.prashant.app.module.ParkingStart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingStartRepository extends JpaRepository<ParkingStart, Integer> {



    ParkingStart findByParkingNo(String parkingNumber);
}
