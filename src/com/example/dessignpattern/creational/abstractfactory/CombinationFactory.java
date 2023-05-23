package com.example.dessignpattern.creational.abstractfactory;

public class CombinationFactory implements Factory{
    @Override
    public Pizza createPizza() {
        return new CombinationPizza();
    }

    @Override
    public Drink createDrink() {
        return new Beer();
    }
}
