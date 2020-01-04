package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.RCRegistration;

@Repository
public interface RCRegistrationRepo extends JpaRepository<RCRegistration,Long>{

}
