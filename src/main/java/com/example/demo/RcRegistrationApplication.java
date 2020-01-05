package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Models.RCRegistration;
import com.example.demo.Models.VehicleType;
import com.example.demo.repositories.RCRegistrationRepo;
import com.example.demo.repositories.VehicleRepository;

@SpringBootApplication
public class RcRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RcRegistrationApplication.class, args);
	}
	
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private RCRegistrationRepo rcRegistrationRepo;
	
	@PostConstruct
	public void addData(){
		VehicleType wagonR = new VehicleType("LMV","Maruti","WagonR");
		vehicleRepository.save(wagonR);
		VehicleType audi = new VehicleType("LMV","Audi","Q5");
		vehicleRepository.save(audi);
		VehicleType bmw = new VehicleType("LMV","BMW","X7");
		vehicleRepository.save(bmw);
	
	 RCRegistration MH12NQ1274 = new RCRegistration("MH12NQ1274","Abhishek","Pune",new Date(),"No","RED",wagonR);
	 rcRegistrationRepo.save(MH12NQ1274);
	 RCRegistration KA51HA0290 = new RCRegistration("KA51HA0290","Ajey","Bangalore",new Date(),"No","Black",audi);
	 rcRegistrationRepo.save(KA51HA0290);
	 RCRegistration CG04KJ8786 = new RCRegistration("CG04KJ8786","Aakash","Raipur",new Date(),"No","White",bmw);
	 rcRegistrationRepo.save(CG04KJ8786);
	}
}
