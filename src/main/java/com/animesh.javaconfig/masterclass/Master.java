package com.animesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Employee emp1 = context.getBean(Employee.class);
        System.out.println(emp1.toString());
    }
}
