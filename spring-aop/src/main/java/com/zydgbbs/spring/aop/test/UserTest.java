package com.zydgbbs.spring.aop.test;

import com.zydgbbs.spring.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
        userService.select();
    }
}
