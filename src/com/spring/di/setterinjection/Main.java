package com.spring.di.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/di/setterinjection/container.xml");
        System.out.println(file.exists());

        /**
         create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/setterinjection/container.xml");
        /**
         get a new object from User
         */
        UserInterface user1 = context.getBean("user", UserInterface.class);

        user1.getPerson();
        context.close();


    }

}
