package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired2Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired2.xml");
        Person person = context.getBean("person",Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }
}
