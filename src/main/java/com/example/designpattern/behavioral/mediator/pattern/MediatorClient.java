package com.example.designpattern.behavioral.mediator.pattern;

import com.example.designpattern.behavioral.mediator.pattern.mediator.ChatMediator;
import com.example.designpattern.behavioral.mediator.pattern.mediator.Mediator;
import com.example.designpattern.behavioral.mediator.pattern.user.AdminUser;
import com.example.designpattern.behavioral.mediator.pattern.user.NormalUser;
import com.example.designpattern.behavioral.mediator.pattern.user.AnonymousUser;
import com.example.designpattern.behavioral.mediator.pattern.user.User;

public class MediatorClient {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();
        User anonymousUser = new AnonymousUser("익명유저", mediator);
        AdminUser admin = new AdminUser("어드민", mediator);
        User user1 = new NormalUser("노말유저1", mediator);
        User user2 = new NormalUser("노말유저2", mediator);
        User user3 = new NormalUser("노말유저3", mediator);

        System.out.println("========= 익명유저 입장 =========");
        mediator.addUser(anonymousUser);
        System.out.println("========= 어드민 입장 =========");
        mediator.addUser(admin);
        System.out.println("========= 유저들 입장 =========");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        System.out.println("========= 유저1 메시지 =========");
        user1.sendMessageAll("안녕하세요!");

        System.out.println("========= 유저1 <-> 유저2 =========");
        user1.sendMessage(user2, "안녕 user2야");
        user2.sendMessage(user1, "반가워 suer1아");

        System.out.println("========= 어드민 공지 =========");
        admin.sendMessageAll("반가워요");

        System.out.println("========= 추방하기 =========");
        admin.kickUser(user2, "도배");

        System.out.println("========= 익명유저 -> 유저1 =========");
        anonymousUser.sendMessage(user1, "난 익명이지롱 바부야");

    }
}
