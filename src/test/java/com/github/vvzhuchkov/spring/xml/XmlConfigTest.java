package com.github.vvzhuchkov.spring.xml;

import com.github.vvzhuchkov.spring.xml.beans.CarRepository;
import com.github.vvzhuchkov.spring.xml.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class XmlConfigTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    void xmlTest() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("beans.xml");
        context.refresh();

        CarRepository repoBean = context.getBean(CarRepository.class);
        BeanDefinition repoBeanDefinition = context.getBeanDefinition("repositoryXml");
        assertNotNull(repoBean);
        assertNotNull(repoBeanDefinition);
        System.out.println(repoBean.toString());
        System.out.println(repoBeanDefinition);
    }

    @Test
    void xmlCarTest(){
        Car car = (Car) context.getBean("car");
        assertNotNull(car);
        System.out.println("ID: " + car.getId());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
    }

    @Test
    void xmlInitDestroyTest(){
        Car car = (Car) context.getBean("car");
        assertNotNull(car);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
