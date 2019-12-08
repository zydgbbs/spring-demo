package com.zydgbbs.spring.ioc.config;

import com.zydgbbs.spring.ioc.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public User user(){
        return new User("张三");
    }
}
