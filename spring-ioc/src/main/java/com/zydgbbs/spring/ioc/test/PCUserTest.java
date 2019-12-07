package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PCUserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("pcbeans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.getName());
        User user2 = context.getBean("user2",User.class);
        System.out.println(user2.getName());
    }
}
