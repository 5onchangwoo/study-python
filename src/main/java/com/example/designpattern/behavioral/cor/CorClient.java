package com.example.designpattern.behavioral.cor;

import com.example.designpattern.behavioral.cor.handler.Handler;
import com.example.designpattern.behavioral.cor.handler.RoleCheckHandler;
import com.example.designpattern.behavioral.cor.handler.UserExistsHandler;
import com.example.designpattern.behavioral.cor.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorClient {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Handler handler = Handler.link(
                new UserExistsHandler(server),
                new RoleCheckHandler()
        );

        server.setHandler(handler);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do {
            System.out.print("이메일을 입력하시오: ");
            String email = reader.readLine();
            System.out.print("패스워드를 입력하시오: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);

    }
}
