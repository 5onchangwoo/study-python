package com.example.designpattern.behavioral.commandv2;

import java.util.ArrayList;
import java.util.List;

public class CommandGroup implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void run() {
        int size = commands.size();
        for (Command command : commands) {
            command.run();
        }
    }
}
