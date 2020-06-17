package com.github.vvzhuchkov.spring.xml.beans;

import com.github.vvzhuchkov.spring.xml.model.Car;

public interface CarRepository {
    Car findCarByBrand(String brand);
}
