package com.animesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    Department dept;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${salary}")
    private Double salary;
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + dept +
                '}';
    }

    /*public void p() {
        System.out.println("bkh");
        dept.print();
    }*/
}

