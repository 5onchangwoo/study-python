package com.example.designpattern.behavioral.cor.handler;

public abstract class Handler {
    private Handler next;

    public static Handler link(Handler first, Handler... chain) {
        Handler head = first;
        for (Handler nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
