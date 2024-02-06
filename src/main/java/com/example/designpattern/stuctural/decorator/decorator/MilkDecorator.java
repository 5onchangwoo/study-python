package com.example.designpattern.stuctural.decorator.decorator;

import com.example.designpattern.stuctural.decorator.coffee.Coffee;

public class MilkDecorator extends Decorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 700;
    }
}
