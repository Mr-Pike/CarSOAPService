package com.example.car.service;

import com.example.car.model.Car;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.example.car.service.CarService")
public class CarServiceImpl implements CarService  {

    private static List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public Car getCarById(int id) {
        return cars.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
