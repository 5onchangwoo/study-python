package com.example.designpattern.behavioral.mediator.pattern.mediator;

import com.example.designpattern.behavioral.mediator.pattern.user.User;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private final List<User> users;

    public ConcreteMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessageAll(User from, String msg) {
        for (User user : users) {
            if(user == from) continue;
            user.receiveMessage(from, msg);
        }

    }

    @Override
    public void sendMessage(User from, User to, String msg) {
        to.receiveMessage(from, msg);
    }

    @Override
    public void addUser(User user) {
        sendMessageAll(user, user.getName() + "님이 접속하였습니다.");
        this.users.add(user);

    }

    @Override
    public void removeUser(User user) {
        sendMessageAll(user, user.getName() + "님이 퇴장하였습니다.");
        this.users.add(user);
    }
}
