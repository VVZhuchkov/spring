package com.github.vvzhuchkov.spring.xml;

import com.github.vvzhuchkov.spring.xml.model.CarBrandModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        int n=5;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        for(int i=0;i<n;i++) {
            context.getBean(CarBrandModel.class).fullBrandModel();
            System.out.println();
        }
    }
}
