package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.factory.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("factory.xml");
        Car car1 = ctx.getBean("car1",Car.class);
        System.out.println(car1);
        Car car2 = ctx.getBean("car2",Car.class);
        System.out.println(car2);
        Car car3 = ctx.getBean("car3",Car.class);
        System.out.println(car3);
    }
}
