package com.example.designpattern.behavioral.mediator.pattern.user;

import com.example.designpattern.behavioral.mediator.pattern.mediator.Mediator;

public class AnonymousUser extends User{
    public AnonymousUser(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(User to, String msg) {
        System.out.println("익명 유저는 메시지를 전송할 수 없습니다.");
    }
}
