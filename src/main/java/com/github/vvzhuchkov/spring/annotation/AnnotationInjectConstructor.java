package com.github.vvzhuchkov.spring.annotation;

import com.github.vvzhuchkov.spring.annotation.beans.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationInjectConstructor {

    private CarRepository carRepository;

    @Autowired
    public AnnotationInjectConstructor(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarRepository getCarRepository() {
        return carRepository;
    }

    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
