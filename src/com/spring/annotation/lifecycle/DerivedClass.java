package com.spring.annotation.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")

public class DerivedClass implements MasterInterface {
    @Override
    public void name() {
        System.out.println("Hallo From DerivedClass");

    }
}