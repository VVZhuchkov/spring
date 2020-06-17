package com.github.vvzhuchkov.spring.annotation;

import com.github.vvzhuchkov.spring.annotation.beans.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationInjectField {

    @Autowired
    private CarRepository carRepository;

    public CarRepository getCarRepository() {
        return carRepository;
    }
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}

