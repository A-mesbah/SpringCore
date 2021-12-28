package com.spring.qulifier;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public void name() {
        System.out.println("Hallo i'm Dog");
    }

    @Override
    public void walk() {
        System.out.println("Haw can Dog Walk");
    }
}
