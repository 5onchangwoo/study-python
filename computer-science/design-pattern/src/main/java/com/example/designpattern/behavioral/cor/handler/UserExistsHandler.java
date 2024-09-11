package com.example.designpattern.behavioral.cor.handler;

import com.example.designpattern.behavioral.cor.server.Server;

public class UserExistsHandler extends Handler {
    private Server server;

    public UserExistsHandler(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("해당 이메일은 가입되지 않았습니다.");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("비밀번호가 틀렸습니다.");
            return false;
        }

        System.out.println("인증 성공");
        return checkNext(email, password);
    }
}
