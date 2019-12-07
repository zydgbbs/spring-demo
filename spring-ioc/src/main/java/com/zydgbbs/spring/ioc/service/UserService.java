package com.zydgbbs.spring.ioc.service;

import com.zydgbbs.spring.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void getName(){
        userDao.getName();
    }
}
