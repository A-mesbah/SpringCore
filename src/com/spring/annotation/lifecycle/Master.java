package com.spring.annotation.lifecycle;

import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {
    @Override
    public void name() {
        System.out.println("Hallo From Master");
    }
}
