package com.example.designpattern.behavioral.commandv2;

public class CommandClient {
    public static void main(String[] args) {
        CommandGroup commandGroup = new CommandGroup();
        PrintCommand printCommand = new PrintCommand("안녕하세요!");

        commandGroup.add(new ClearCommand());
        commandGroup.add(new ColorCommand(ColorCommand.Color.GREEN));
        commandGroup.add(new MoveCommand(10, 1));
        commandGroup.add(printCommand);
        commandGroup.add(new MoveCommand(15, 5));
        commandGroup.add(printCommand);
        commandGroup.add(new MoveCommand(25, 8));
        commandGroup.add(printCommand);
        commandGroup.add(new ColorCommand(ColorCommand.Color.RED));
        commandGroup.add(printCommand);

        commandGroup.run();

    }
}
