package com.example.designpattern.behavioral.mediator.pattern.user;

import com.example.designpattern.behavioral.mediator.pattern.mediator.Mediator;
import lombok.Getter;

public abstract class User {
    @Getter
    private String name;

    protected Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessageAll(String msg){
        mediator.sendMessageAll(this, msg);
    }

    public void sendMessage(User to, String msg){
        mediator.sendMessage(to, this, msg);
    }
    public void receiveMessage(User from, String msg){
        System.out.println(from.getName() + " >> " + this.name + ": " + msg);
    }
}
