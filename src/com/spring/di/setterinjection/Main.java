package com.spring.di.constrocturinjection;

import com.spring.ioc.Sport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/di/constrocturinjection/container.xml");
        System.out.println(file.exists());

        /**
         create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/constrocturinjection/container.xml");
        /**
         get a new object from class FootBall
         */
        UserInterface user1 = context.getBean("user", UserInterface.class);

        user1.getPerson();
        context.close();


    }
    //we can pass any class to the Constructor of User Such This Class implements the PersonInterface
  /*
      Person person = new Person();
      User user = new User(person);
        user.start();
   */
}
