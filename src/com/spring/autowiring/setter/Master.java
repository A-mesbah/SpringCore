package com.spring.autowiring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface {

    private SportInterface sportInterface;


    @Override
    public void name() {
        System.out.println("Hallo From Master");
    }

    @Override
    public void callMySport() {
        this.sportInterface.mySport();
    }

    @Autowired
    public void setSportInterface(SportInterface sportInterface) {
        this.sportInterface = sportInterface;
    }
}
