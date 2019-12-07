package com.zydgbbs.spring.ioc.controller;

import com.zydgbbs.spring.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
public class UserController {
    @Autowired
    private UserService userService;

    public void getName(){
        userService.getName();
    }
}
