package com.github.vvzhuchkov.spring.xml.model;

import com.github.vvzhuchkov.spring.xml.profiling.Profiling;

import java.util.logging.Logger;

@Profiling
public class Car implements CarBrandModel {
    private static Logger log = Logger.getLogger(String.valueOf(Car.class));

    private Long id;
    private String brand;
    private String model;

    public Car(Long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public void init(){
        log.info("Init method worked");
    }
    public void destroy(){
        log.info("Destroy method worked");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void fullBrandModel() {
        String fullBrandModel = brand + " " + model;
        System.out.println(fullBrandModel);
    }
}
