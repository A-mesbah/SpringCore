package com.spring.qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo implements ZooInterface {
    @Autowired
    @Qualifier("cat")
    private Animal animal;



    @Override
    public void getAnimalName() {
        this.animal.name();

    }
}
