package com.spring.bean;


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
        MasterInterface ms = context.getBean("getMasterWithConstructor", MasterInterface.class);
        ms.name2();

        System.out.println("-----------------------------------------------------------------------");
        /**
         * the id there is the name of my Method with annotation @Bean in my springConfiguration with @Configuration annotation
         */
        MasterInterface ms1 = context.getBean("getMaster", MasterInterface.class);
        ms1.name();
        context.close();


    }

}
