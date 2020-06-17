package com.github.vvzhuchkov.spring.java;

import com.github.vvzhuchkov.spring.java.model.Car;
import com.github.vvzhuchkov.spring.java.beans.impl.JavaConfig;
import com.github.vvzhuchkov.spring.java.collection.Collection;
import com.github.vvzhuchkov.spring.java.collection.CollectionConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class JavaConfigTest {
    @Test
    void getBeanTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();

        BeanConfig bean = context.getBean(BeanConfig.class);

        assertNotNull(bean);
        assertNotNull(bean.carRepository());
        System.out.println(bean);
        System.out.println(bean.carRepository());
    }

    @Test
    void brand() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Test
    void collectionTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CollectionConfig.class);
        context.refresh();
        final Collection bean =  context.getBean(Collection.class);
        System.out.println(bean);
        context.close();
    }

    @Test
    void getPropFileForCarTest(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Car.class);
        context.refresh();

        Car bean = context.getBean(Car.class);

        assertNotNull(bean);
        System.out.println(bean.getId() + " " + bean.getBrand() + " " + bean.getModel());
    }
}
