package com.github.vvzhuchkov.spring.annotation;

import com.github.vvzhuchkov.spring.annotation.beans.CarRepository;
import com.github.vvzhuchkov.spring.annotation.beans.CarService;
import com.github.vvzhuchkov.spring.annotation.beans.impl.CarRepositoryImpl;
import com.github.vvzhuchkov.spring.annotation.beans.impl.CarServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationTest {

    @Test
    void annotationTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CarRepositoryImpl.class);
        context.register(CarServiceImpl.class);
        context.refresh();

        CarRepository beanRepository = context.getBean(CarRepository.class);
        BeanDefinition beanDefinition = context.getBeanDefinition("carRepositoryImpl");
        assertNotNull(beanRepository);
        assertNotNull(beanDefinition);
        System.out.println(beanRepository);
        System.out.println(beanDefinition);
    }

    @Configuration
    static class BeanConfig{

        @Bean
        public CarService CarService(CarRepository carRepository){
            return new CarServiceImpl(carRepository);
        }

        @Bean
        public CarRepository carRepository(){
            return new CarRepositoryImpl();
        }
    }

    @Test
    void getBeanByConstructorTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.register(AnnotationInjectConstructor.class);
        context.refresh();

        AnnotationInjectConstructor bean = context.getBean(AnnotationInjectConstructor.class);

        assertNotNull(bean);
        assertNotNull(bean.getCarRepository());

        System.out.println(bean);
        System.out.println(bean.getCarRepository());
    }

    @Test
    void getBeanBySetterTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.register(AnnotationInjectSetter.class);
        context.refresh();

        AnnotationInjectSetter bean = context.getBean(AnnotationInjectSetter.class);

        assertNotNull(bean);
        assertNotNull(bean.getCarRepository());

        System.out.println(bean);
        System.out.println(bean.getCarRepository());
    }

    @Test
    void getBeanByFieldTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.register(AnnotationInjectField.class);
        context.refresh();

        AnnotationInjectField bean = context.getBean(AnnotationInjectField.class);

        assertNotNull(bean);
        assertNotNull(bean.getCarRepository());

        System.out.println(bean);
        System.out.println(bean.getCarRepository());
    }
}