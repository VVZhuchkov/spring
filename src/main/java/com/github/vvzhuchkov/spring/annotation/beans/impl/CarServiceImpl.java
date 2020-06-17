package com.github.vvzhuchkov.spring.annotation.beans.impl;

import com.github.vvzhuchkov.spring.annotation.beans.CarRepository;
import com.github.vvzhuchkov.spring.annotation.beans.CarService;
import com.github.vvzhuchkov.spring.annotation.model.Car;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public String fullBrandModel(String brand) {
        Car car = carRepository.findCarByBrand(brand);
        if(car != null){
            return (car.getBrand() + " " + car.getModel());
        } else {
            return "The car is not found!";
        }
    }
}
