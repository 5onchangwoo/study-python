package com.example.designpattern.behavioral.cor.handler;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("반갑습니다, 어드민!");
            return true;
        }
        System.out.println("반갑습니다, 일반유저!");
        return checkNext(email, password);
    }
}
