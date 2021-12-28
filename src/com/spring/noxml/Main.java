package com.spring.noxml;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        /**
         * using AnnotationConfigApplicationContext object to read our springconfiguration class
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        /**
         get a new object from class Master
         */
        MasterInterface ms = context.getBean("master", MasterInterface.class);
        ms.name();
        context.close();


    }

}
