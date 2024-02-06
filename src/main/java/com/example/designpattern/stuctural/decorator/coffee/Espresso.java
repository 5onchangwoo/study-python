package com.example.designpattern.stuctural.decorator.coffee;

public class Espresso implements Coffee {
    @Override
    public int cost() {
        return 1500;
    }
}
