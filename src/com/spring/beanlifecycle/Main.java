package com.spring.beancycle;

import com.spring.beanscope.UserInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * make sure that the container File Already exists
         */
        File file = new File("src/com/spring/beancycle/container.xml");
        System.out.println("File Exist : "+file.exists());


        /**
         create new Object From ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beancycle/container.xml");
        /**
         get a new object from User
         */
        UserInterface user1 = context.getBean("user", UserInterface.class);
        UserInterface user2 = context.getBean("user", UserInterface.class);
        System.out.println(user1.equals(user2));

        System.out.println("User1 Data  :" + user1.getEmail() +"   "+ user1.getTeam());

        System.out.println("User1 Data  :" + user2.getEmail() +"   "+ user2.getTeam());

        context.close();


    }

}
