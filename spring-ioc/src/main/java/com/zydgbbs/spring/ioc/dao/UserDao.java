package com.zydgbbs.spring.ioc.dao;

import com.zydgbbs.spring.ioc.domain2.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private User user;
    public void getName(){
        System.out.println(user.name);
    }
}
