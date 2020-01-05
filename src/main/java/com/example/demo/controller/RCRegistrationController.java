package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.RCRegistration;
import com.example.demo.response.RCRegistrationResponse;
import com.example.demo.service.RCService;

@RestController
@RequestMapping("/rcreg")
public class RCRegistrationController {
	
	@Autowired
	private RCService rcService;
	
	@GetMapping("/{rcNo}")
	public RCRegistration getRCDetails(@PathVariable(name="rcNo")String rcNo){
		System.out.println("Inside getRCDetails method");
		return rcService.getRCDetails(rcNo);
	}
	@GetMapping("/")
	public ResponseEntity getRCDetailsByOwnerName(@RequestParam(name="name")String ownerName){
		RCRegistrationResponse rcEntity =rcService.getRCDetailsByOwnerName(ownerName); 
		return new ResponseEntity(rcEntity, HttpStatus.OK);
	}

}
