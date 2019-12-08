package com.zydgbbs.spring.ioc.config;

import com.zydgbbs.spring.ioc.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan("com.zydgbbs.spring.ioc")扫描包
//@Import(OtherConfiguration.class)导入其他配置类
public class MyConfiguration {
    @Bean
    public User user(){
        return new User("张三");
    }
}
