package com.github.vvzhuchkov.spring.xml.beans.impl;

import com.github.vvzhuchkov.spring.xml.beans.CarRepository;
import com.github.vvzhuchkov.spring.xml.beans.CarService;
import com.github.vvzhuchkov.spring.xml.model.Car;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final String brand;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
        this.brand = "Honda";
    }

    @Override
    public String fullBrandModel(String brand) {
        Car car = carRepository.findCarByBrand(brand);
        if(car != null){
            String fullBrandModel = (car.getBrand() + " " + car.getModel());
            return fullBrandModel;
        } else {
            return "The car is not found!";
        }
    }
}
