package com.example.designpattern.behavioral.mediator.pattern.user;

import com.example.designpattern.behavioral.mediator.pattern.mediator.Mediator;

public class AdminUser extends User{
    public AdminUser(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessageAll( String msg) {
        super.sendMessageAll("[ADMIN] **" + msg + "**");
    }

    @Override
    public void sendMessage(User to, String msg) {
        super.sendMessage(to, "[ADMIN] **" + msg + "**");
    }

    public void kickUser(User user, String cause) {
        this.sendMessageAll(user.getName() + "를 " + cause + "의 원인으로 추방합니다.");
        mediator.removeUser(user);
    }
}
