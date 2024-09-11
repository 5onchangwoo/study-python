package com.example.designpattern.creational.abstractfactory;

public class BulgogiFactory implements Factory {

    @Override
    public Pizza createPizza() {
        return new BulgogiPizza();
    }

    @Override
    public Drink createDrink() {
        return new Cola();
    }
}
