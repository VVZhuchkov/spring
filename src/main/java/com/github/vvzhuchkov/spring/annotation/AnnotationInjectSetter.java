package com.github.vvzhuchkov.spring.annotation;

import com.github.vvzhuchkov.spring.annotation.beans.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotationInjectSetter {

    private CarRepository carRepository;

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public CarRepository getCarRepository() {
        return carRepository;
    }
}
