package com.spring.qulifier;

import org.springframework.stereotype.Component;

@Component
public class Snake implements Animal{
    @Override
    public void name() {
        System.out.println("Hallo i'm Snake");
    }

    @Override
    public void walk() {
        System.out.println("Is Snake Walk !!!");
    }
}
