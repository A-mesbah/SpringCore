package com.spring.annotation.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("master")
public class Master implements MasterInterface {
    @Override
    public void name() {
        System.out.println("Hallo From Master");
    }
    @PostConstruct
    /**
     * This Method wil be applied before initialize Bean of Type master
     */
    public void beforeBeanInitialization(){
        System.out.println("Before Bean Initialization");
    }
    @PreDestroy
    /**
     * This Method wil be applied before destroy  Bean of Type master
     */
    public void beforeBeanDestroying (){
        System.out.println("Before Bean Destroying");
    }


}
