package com.github.vvzhuchkov.spring.java.beans.impl;

import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean("rep-1")
    public CarRepositoryImpl CarRepository(){
        return new CarRepositoryImpl();
    }

    @Bean("rep-2")
    public CarRepositoryImpl CarRepository2(){
        return new CarRepositoryImpl();
    }
}
