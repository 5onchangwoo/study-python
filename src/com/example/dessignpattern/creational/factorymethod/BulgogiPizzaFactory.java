package com.example.dessignpattern.creational.factorymethod;

public class BulgogiPizzaFactory extends PizzaFactory{
    public BulgogiPizzaFactory(int count) {
        super(count);
    }

    @Override
    Pizza createPizza() {
        if(count > 0){
            count--;
            return new BulgogiPizza();
        }
        return new NullPizza();
    }
}
