package com.spring.di.constrocturinjection;

public class User implements  UserInterface{
    private PersonInterface personInterface ;

    public User(PersonInterface personInterface) {
        this.personInterface = personInterface;
    }

    @Override
    public void start() {
        System.out.println("i'm User");

    }
    @Override
    public void getPerson(){
        this.personInterface.begain();
    }
}
