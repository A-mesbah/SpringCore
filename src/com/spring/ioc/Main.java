package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/ioc/container.xml");
        System.out.println(file.exists());

        /**
         create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ioc/container.xml");
        /**
         get a new object from class FootBall
         */
        Sport mySport1 = context.getBean("sport1", Sport.class);
        mySport1.start();

        /**
         get a new object from class VolleyBall
         */
        Sport mySport2 = context.getBean("sport2", Sport.class);
        mySport2.start();
        /**
         * close my context
         */
        context.close();

    }
}
