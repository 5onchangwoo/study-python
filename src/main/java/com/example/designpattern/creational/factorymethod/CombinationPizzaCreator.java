package com.example.designpattern.creational.factorymethod;

public class CombinationPizzaCreator extends PizzaCreator {
    public CombinationPizzaCreator(int count) {
        super(count);
    }

    @Override
    Pizza createPizza() {
        if(count > 0) {
            count--;
            return new CombinationPizza();
        }
        return new NullPizza();
    }
}
