package com.spring.autowiring.setter;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/autowiring/setter/container.xml");
        System.out.println("File Exist : " + file.exists());
        /**
         *create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/setter/container.xml");
        /**
         get a new object from master Class where
         * @parm master : this is the name of the Bean that you can give to in component annotation
         */
        MasterInterface ms = context.getBean("master", MasterInterface.class);
        ms.callMySport();





    }

}
