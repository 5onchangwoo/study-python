package com.example.dessignpattern.creational.factorymethod;

public class CombinationPizzaFactory extends PizzaFactory{
    public CombinationPizzaFactory(int count) {
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
