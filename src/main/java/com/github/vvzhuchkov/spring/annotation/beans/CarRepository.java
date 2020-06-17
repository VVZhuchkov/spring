package com.github.vvzhuchkov.spring.annotation.beans;

import com.github.vvzhuchkov.spring.annotation.model.Car;

public interface CarRepository {
    Car findCarByBrand(String brand);
}
