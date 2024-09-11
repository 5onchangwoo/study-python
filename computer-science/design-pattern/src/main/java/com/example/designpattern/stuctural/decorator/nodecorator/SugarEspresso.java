package com.example.designpattern.stuctural.decorator.nodecorator;

public class SugarEspresso implements Coffee{

    @Override
    public int cost() {
        return 1500 + 500;
    }
}
