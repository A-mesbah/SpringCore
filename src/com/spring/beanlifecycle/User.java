package com.spring.beanlifecycle;

public class User implements UserInterface {
    private String email;
    private String team;


    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTeam() {
        return team;
    }

    /**
     * This Method will be applied before working with my Bean
     * forEx: if you want to open connection with DB
     */
    private void doStart() {
        System.out.println("do something before working  with this bean");
    }

    /**
     * This Method will be applied after working with my Bean
     * forEx: if you want to close  connection with DB
     * note:if you do not close the context this Method will not be applied
     */
    private void doEnd() {
        System.out.println("do something after working  with this bean");
    }
}
