package com.example.designpattern.stuctural.decorator.decorator;

import com.example.designpattern.stuctural.decorator.coffee.Coffee;

public class Decorator implements Coffee {
    protected Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost();
    }

}
