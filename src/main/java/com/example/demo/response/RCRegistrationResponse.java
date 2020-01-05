package com.example.demo.response;

import java.util.Date;

public class RCRegistrationResponse {
	
private String RCNo;
	
	private String ownerName;
	
	private String City;
	
	private String color;
	
	private String type;
	
	private String brand;
	
	private String model;
	

	public String getRCNo() {
		return RCNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getCity() {
		return City;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public void setRCNo(String rCNo) {
		RCNo = rCNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
