package com.example.designpattern.behavioral.mediator.pattern.mediator;

import com.example.designpattern.behavioral.mediator.pattern.user.User;

public interface Mediator {
    void sendMessageAll(User from, String msg);
    void sendMessage(User from, User to, String msg);
    void addUser(User user);
    void removeUser(User user);
}
