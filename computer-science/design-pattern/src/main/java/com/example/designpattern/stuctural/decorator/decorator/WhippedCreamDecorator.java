package com.example.designpattern.stuctural.decorator.decorator;

import com.example.designpattern.stuctural.decorator.coffee.Coffee;

public class WhippedCreamDecorator extends Decorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 1000;
    }
}
