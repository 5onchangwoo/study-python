package com.example.designpattern.behavioral.command.command;

import java.util.Deque;
import java.util.LinkedList;

public class CommandHistory {
    private Deque<Command> history = new LinkedList<>();

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
