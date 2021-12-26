package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class DerivedClass implements MasterInterface {
    @Override
    public void name() {
        System.out.println("Hallo from DerivedClass");
    }
}
