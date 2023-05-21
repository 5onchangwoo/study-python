package com.example.dessignpattern.creational.factorymethod;

public class NullPizza implements Pizza{
    @Override
    public void eat() {
        System.out.println("피자가 없어서 못머거용 ㅠㅠ");
    }
}
