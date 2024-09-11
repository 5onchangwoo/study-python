package com.example.designpattern.behavioral.mediator.nopattern;

import java.util.ArrayList;
import java.util.List;

public class NoMediatorClient {
    public static void main(String[] args) {

        // 방 생성
        List<User> userList = new ArrayList<>();

        // 유저 입장
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        User user4 = new User("user4");

        userList.addAll(List.of(user1, user2, user3, user4));

        sendToAll(user1, "안녕 애들아", userList);

        // 귓속말
        user1.sendMessage("user2야 나랑 놀자", user2);
        user2.sendMessage("그래 user1아", user1);
    }

    private static void sendToAll(User from, String msg, List<User> userList){
        for (User user : userList) {
            if (from != user) {
                from.sendMessage(msg, user);
            }
        }
    }
}
