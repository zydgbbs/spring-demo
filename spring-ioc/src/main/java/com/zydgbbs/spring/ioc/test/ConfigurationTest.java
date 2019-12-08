package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.config.MyConfiguration;
import com.zydgbbs.spring.ioc.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        User user = context.getBean("user", User.class);
        user.show();
    }

}
