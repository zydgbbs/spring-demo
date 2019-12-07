package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
        Person person = context.getBean("person",Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }
}
