package com.zydgbbs.spring.ioc.config;

import com.zydgbbs.spring.ioc.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.zydgbbs.spring.ioc")
public class MyConfiguration {
    @Bean
    public User user(){
        return new User("张三");
    }
}
