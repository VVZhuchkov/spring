package com.github.vvzhuchkov.spring.java;

import com.github.vvzhuchkov.spring.java.beans.CarRepository;
import com.github.vvzhuchkov.spring.java.beans.CarService;
import com.github.vvzhuchkov.spring.java.beans.impl.CarRepositoryImpl;
import com.github.vvzhuchkov.spring.java.beans.impl.CarServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CarService carService(CarRepository carRepository){
        return new CarServiceImpl(carRepository);
    }

    @Bean
    public CarRepository carRepository(){
        return new CarRepositoryImpl();
    }
}
