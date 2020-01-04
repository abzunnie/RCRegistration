package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RCRegistration {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private String RCNo;
	
	private String ownerName;
	
	private String City;
	
	private Date registrationDate;
	
	private String hypothicatedTo;
	
	private String color;

	@OneToOne
	private VehicleType vehicleType;

	public RCRegistration() {
		}

	public RCRegistration(String rCNo, String ownerName, String city, Date registrationDate,
			String hypothicatedTo, String color, VehicleType vehicleType) {
		super();
		RCNo = rCNo;
		this.ownerName = ownerName;
		City = city;
		this.registrationDate = registrationDate;
		this.hypothicatedTo = hypothicatedTo;
		this.color = color;
		this.vehicleType = vehicleType;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getRCNo() {
		return RCNo;
	}

	public void setRCNo(String rCNo) {
		RCNo = rCNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getHypothicatedTo() {
		return hypothicatedTo;
	}

	public void setHypothicatedTo(String hypothicatedTo) {
		this.hypothicatedTo = hypothicatedTo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}
