package com.spring.di.setterinjection;

public class User implements UserInterface {
    private PersonInterface personInterface ;


    /**
     * setter Injection
     * @param personInterface
     */
    public void setPersonInterface(PersonInterface personInterface) {
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
