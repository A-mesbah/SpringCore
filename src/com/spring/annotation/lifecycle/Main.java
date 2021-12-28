package com.spring.annotation.lifecycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/annotation/lifecycle/container.xml");
        System.out.println("File Exist : " + file.exists());
        /**
         *create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotation/lifecycle/container.xml");
        /**
         get a new object from master Class where
         * @parm master : this is the name of the Bean that you can give to in component annotation
         */
        MasterInterface ms = context.getBean("master", MasterInterface.class);
        ms.name();
        System.out.println("---------------default bean name----------");

        MasterInterface ms2 = context.getBean("master", MasterInterface.class);
        ms2.name();
        System.out.println("---------------@Scope with Singleton ----------");
        System.out.println(ms.equals(ms2));
        context.close();


    }

}
