package com.spring.beanscope;

public class User implements UserInterface {
    private PersonInterface personInterface;
    private String email;
    private String team;


    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void start() {
        System.out.println("i'm User");
    }

    @Override
    public void getPerson() {
        this.personInterface.begain();
    }

    /**
     * setter Injection
     *
     * @param personInterface
     */
    public void setPersonInterface(PersonInterface personInterface) {
        this.personInterface = personInterface;
    }

    public PersonInterface getPersonInterface() {
        return personInterface;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTeam() {
        return team;
    }
}
