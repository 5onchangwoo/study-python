package com.example.designpattern.stuctural.decorator.decorator;

import com.example.designpattern.stuctural.decorator.coffee.Coffee;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
