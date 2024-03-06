package com.example.designpattern.behavioral.mediator.pattern.user;

import com.example.designpattern.behavioral.mediator.pattern.mediator.Mediator;

public class SystemUser extends User{
    public SystemUser(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receiveMessage(User from, String msg) {
        System.out.println("시스템은 메시지를 받을 수 없습니다.");
    }
}
