package com.zydgbbs.spring.ioc.domain;

public class User {

    private String name;

    public User(){

    }

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("名字是："+name);
    }
}
