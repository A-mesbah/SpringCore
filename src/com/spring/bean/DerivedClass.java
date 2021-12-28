package com.spring.bean;

import org.springframework.stereotype.Component;


public class DerivedClass implements MasterInterface {
    @Override
    public void name() {
        System.out.println("Hallo From DerivedClass");
    }

    @Override
    public void name2() {

    }
}
