package com.spring.outsource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Employee emp = context.getBean("employee", Employee.class);
        System.out.println("Name   :" + emp.getName() + "\n" + "Email  :" + emp.getemail());
        context.close();
    }


}
