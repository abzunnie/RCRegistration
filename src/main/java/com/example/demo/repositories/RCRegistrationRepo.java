package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.RCRegistration;
import com.example.demo.response.RCRegistrationResponse;

@Repository
public interface RCRegistrationRepo extends JpaRepository<RCRegistration,Long>{
	
	public RCRegistration findByRCNo(String rcNo);
	public RCRegistration findByOwnerName(String ownerName);

}
