package com.github.vvzhuchkov.spring.java.beans.impl;

import com.github.vvzhuchkov.spring.java.beans.CarRepository;
import com.github.vvzhuchkov.spring.annotation.model.Car;

public class CarRepositoryImpl implements CarRepository {

    @Override
    public Car findCarByBrand(String brand) {
        if(brand.equals("Honda")){
            return new Car(1L, "Honda", "Civic");
        } else {
            throw new IllegalArgumentException("The car is not found!");
        }
    }
}
