package com.zydgbbs.spring.test;

import com.zydgbbs.spring.domain.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);
        System.out.println(helloWorld.getStr());
    }
}
