package com.example.car.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.car.model.Car;

@WebService
public interface CarService {
	
	@WebMethod
	void addCar(Car voiture);
	
	@WebMethod
	Car getCarById(int id);
	
	@WebMethod
	List<Car> getAllCars();
}
