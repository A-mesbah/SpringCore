package com.spring.qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {


    @Override
    public void name() {
        System.out.println("Hallo i'm cat");
    }

    @Override
    public void walk() {
        System.out.println("Haw can cat Walk");

    }


}
