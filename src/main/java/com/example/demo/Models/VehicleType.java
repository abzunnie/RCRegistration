package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VehicleType {

	@Id
	@GeneratedValue
	private Long Id;
	
	private String type;
	
	private String brand;
	
	private String model;
	
	
	public VehicleType() {
	}


	public VehicleType(String type, String brand, String model) {
		this.type = type;
		this.brand = brand;
		this.model = model;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
}
