package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {
    @Autowired
    private SportInterface sportInterface;

    public Master(SportInterface sportInterface) {
        this.sportInterface = sportInterface;
    }

    @Override
    public void name() {
        System.out.println("Hallo From Master");
    }

    @Override
    public void callMySport() {
        this.sportInterface.mySport();
    }
}
