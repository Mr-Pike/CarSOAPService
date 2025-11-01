package com.example.car.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
public class Car implements Serializable {
	private int id;
    private String brand;
    private String model;
    private int year;
    
    public Car() {}
    
    public Car(int id, String brand, String model, int year) {
    	this.id = id;
    	this.brand = brand;
    	this.model = model;
    	this.year = year;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setbBand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
