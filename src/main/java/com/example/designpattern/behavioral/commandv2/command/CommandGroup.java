package com.example.designpattern.behavioral.commandv2.command;

import java.util.ArrayList;
import java.util.List;

public class CommandGroup implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public Command pop(){
        int last = commands.size() - 1;
        Command popCommand = commands.get(last);
        commands.remove(last);
        return popCommand;
    }

    @Override
    public void run() {
        int size = commands.size();
        for (Command command : commands) {
            command.run();
        }
    }
}
