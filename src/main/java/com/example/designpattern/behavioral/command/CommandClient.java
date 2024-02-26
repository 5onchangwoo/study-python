package com.example.designpattern.behavioral.command;

import com.example.designpattern.behavioral.command.editor.Editor;

public class CommandClient {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
