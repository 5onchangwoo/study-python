package com.example.designpattern.behavioral.cor.server;

import com.example.designpattern.behavioral.cor.handler.Handler;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    @Setter
    private Handler handler;

    public boolean logIn(String email, String password) {
        if (handler.check(email, password)) {
            System.out.println("인증 성공");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
    
}
