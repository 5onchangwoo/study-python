package com.example.dessignpattern.creational.factorymethod;

public abstract class PizzaCreator {
    int count;
    abstract Pizza createPizza();

    public PizzaCreator(int count){
        this.count = count;
    }
}
