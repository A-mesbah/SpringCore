package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class DerivedClass implements MasterInterface {
    @Override
    public void name() {
        System.out.println("Hallo From DerivedClass");
    }
}
