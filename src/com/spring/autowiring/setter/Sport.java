package com.spring.autowiring.setter;

import org.springframework.stereotype.Component;

@Component
public class Sport implements SportInterface {
    @Override
    public void mySport() {
        System.out.println("Tennis is my Sport ");
    }
}
