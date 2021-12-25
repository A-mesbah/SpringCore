package com.spring.outvariable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/outvariable/container.xml");
        System.out.println(file.exists());


        /**
         create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/outvariable/container.xml");
        /**
         get a new object from User
         */
        UserInterface user1 = context.getBean("user", UserInterface.class);

        System.out.println(user1.getEmail()+"\n"+user1.getTeam());;
        context.close();


    }

}
