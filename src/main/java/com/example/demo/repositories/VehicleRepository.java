package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.VehicleType;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleType,Long>{

}
