package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.RCRegistration;
import com.example.demo.repositories.RCRegistrationRepo;
import com.example.demo.repositories.VehicleRepository;
import com.example.demo.response.RCRegistrationResponse;

@Service
public class RCService {
	
	@Autowired
	private RCRegistrationRepo rcRegRepo;
	
	@Autowired
	private VehicleRepository vehicleRepo;
	
	public RCRegistration getRCDetails(String rcNo){
		return rcRegRepo.findByRCNo(rcNo);
	}
	
	public RCRegistrationResponse getRCDetailsByOwnerName(String ownerName){
		RCRegistration rcReg = rcRegRepo.findByOwnerName(ownerName);
		System.out.println(rcReg.getOwnerName());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		RCRegistrationResponse reRegResponse = modelMapper.map(rcReg, RCRegistrationResponse.class);
		System.out.println(reRegResponse.getOwnerName());
		return reRegResponse;
	}

}
