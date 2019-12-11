package com.zydgbbs.spring.ioc.dao;

import com.zydgbbs.spring.ioc.domain2.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    //@Qualifier("user9") domain2 User ("user9")
    private User user;
    public void getName(){
        System.out.println(user.name);
    }
}
