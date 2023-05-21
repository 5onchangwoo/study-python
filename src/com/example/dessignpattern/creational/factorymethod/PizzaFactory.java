package com.example.dessignpattern.creational.factorymethod;

public abstract class PizzaFactory {
    int count;
    abstract Pizza createPizza();

    public PizzaFactory(int count){
        this.count = count;
    }
}
