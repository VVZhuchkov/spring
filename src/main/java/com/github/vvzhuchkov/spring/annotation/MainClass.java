package com.github.vvzhuchkov.spring.annotation;

import com.github.vvzhuchkov.spring.annotation.beans.CarService;
import com.github.vvzhuchkov.spring.annotation.beans.impl.CarRepositoryImpl;
import com.github.vvzhuchkov.spring.annotation.beans.impl.CarServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CarRepositoryImpl.class);
        context.register(CarServiceImpl.class);
        context.refresh();

        CarService beanService = context.getBean(CarService.class);
        System.out.println(beanService.fullBrandModel("Honda"));
    }
}
