package com.example.designpattern.behavioral.mediator.pattern.user;

import com.example.designpattern.behavioral.mediator.pattern.mediator.Mediator;

public class NormalUser extends User {

    public NormalUser(String name, Mediator mediator) {
        super(name, mediator);
    }
}
