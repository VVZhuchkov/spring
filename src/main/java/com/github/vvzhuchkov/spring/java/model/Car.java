package com.github.vvzhuchkov.spring.java.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Configuration
@PropertySource(value = "bean.properties", encoding = "utf-8")
public class Car implements CarBrandModel {

    private static Logger log = Logger.getLogger(String.valueOf(Car.class));

    @Value("${bean.id}")
    private Long id;
    @Value("${bean.brand}")
    private String brand;
    @Value("${bean.model}")
    private String model;

    @PostConstruct
    public void init(){
        log.info("Init method worked");
    }
    @PreDestroy
    public void destroy(){
        log.info("Destroy method worked");
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void fullBrandModel() {
        String fullBrandModel = brand + " " + model;
        System.out.println(fullBrandModel);
    }
}
