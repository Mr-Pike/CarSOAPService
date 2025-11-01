package com.example.car.publisher;

import javax.xml.ws.Endpoint;
import com.example.car.service.CarServiceImpl;

public class CarPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/carservice", new CarServiceImpl());
        System.out.println("CarService is running at http://localhost:8080/carservice?wsdl");
        // http://localhost:7001/MonServiceWeb/CarService?WSDL
    }
}
