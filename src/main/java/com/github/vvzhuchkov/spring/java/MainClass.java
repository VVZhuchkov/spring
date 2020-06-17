package com.github.vvzhuchkov.spring.java;

import com.github.vvzhuchkov.spring.java.beans.CarRepository;
import com.github.vvzhuchkov.spring.java.beans.CarService;
import com.github.vvzhuchkov.spring.java.beans.impl.CarRepositoryImpl;
import com.github.vvzhuchkov.spring.java.beans.impl.CarServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainClass.class);
        context.refresh();

        final CarServiceImpl bean = context.getBean(CarServiceImpl.class);
        System.out.println(bean.fullBrandModel("Honda"));
    }

    @Bean
    public CarService CarService(CarRepository carRepository){
        return new CarServiceImpl(carRepository);
    }

    @Bean
    public CarRepository carRepository(){
        return new CarRepositoryImpl();
    }
}
