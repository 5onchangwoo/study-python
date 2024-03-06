package com.example.designpattern.behavioral.mediator.nopattern;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String msg, User toUser){
        toUser.receiveMessage(msg, this);
    }

    public void receiveMessage(String msg, User fromUser){
        System.out.println(fromUser.name + " >> " + this.name + ": " + msg);
    }
}
