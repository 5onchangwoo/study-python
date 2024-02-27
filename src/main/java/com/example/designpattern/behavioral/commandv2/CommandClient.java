package com.example.designpattern.behavioral.commandv2;

import com.example.designpattern.behavioral.commandv2.command.ColorCommand;
import com.example.designpattern.behavioral.commandv2.command.Command;
import com.example.designpattern.behavioral.commandv2.command.CommandGroup;
import com.example.designpattern.behavioral.commandv2.command.PrintCommand;

public class CommandClient {
    public static void main(String[] args) {
        CommandGroup commandGroup = new CommandGroup();
        PrintCommand printCommand = new PrintCommand("안녕하세요!");

        commandGroup.add(new ColorCommand(ColorCommand.Color.GREEN));
        commandGroup.add(printCommand);
        commandGroup.add(new ColorCommand(ColorCommand.Color.RED));
        commandGroup.add(printCommand);
        commandGroup.add(printCommand);
        commandGroup.add(new ColorCommand(ColorCommand.Color.CYAN));
        commandGroup.add(printCommand);
        commandGroup.run();

        System.out.println("===== 명령 취소 해보기 =====");
        Command popCommand = commandGroup.pop();
        commandGroup.run();

        System.out.println("==== 취소한 명령 다시 실행하기 ====");
        commandGroup.add(popCommand);
        commandGroup.run();

    }
}
