package com.zydgbbs.spring.ioc.test;

import com.zydgbbs.spring.ioc.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
        System.out.println(student.getWife()==null);
    }
}
