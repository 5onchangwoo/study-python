package com.example.designpattern.stuctural.decorator.nodecorator;

public class WhippedCreamDecorator implements Coffee{
    @Override
    public int cost() {
        return 1500 + 1000;
    }
}
