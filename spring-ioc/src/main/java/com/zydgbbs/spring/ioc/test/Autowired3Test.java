package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired3Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired3.xml");
        UserController userController = context.getBean("userController",UserController.class);
        userController.getName();
    }
}
