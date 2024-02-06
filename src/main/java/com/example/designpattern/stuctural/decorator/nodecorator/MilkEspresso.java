package com.example.designpattern.stuctural.decorator.nodecorator;

public class MilkEspresso implements Coffee{
    @Override
    public int cost() {
        return 1500 + 700;
    }
}
