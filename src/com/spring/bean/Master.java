package com.spring.bean;

import org.springframework.stereotype.Component;


public class Master implements MasterInterface {
    private MasterInterface masterInterface;

    public Master() {
    }

    public Master(MasterInterface derivedClass) {
        this.masterInterface = derivedClass;
    }

    @Override
    public void name() {
        System.out.println("Hallo From Master");
    }


    public void name2() {
        this.masterInterface.name();
    }
}
