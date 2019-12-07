package com.zydgbbs.spring.ioc.domain2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("张三")
    public String name;
}
