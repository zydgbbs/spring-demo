package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user",User.class);
        user.show();
        User user2 = context.getBean("user2",User.class);
        user2.show();
    }
}
