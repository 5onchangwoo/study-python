package com.example.designpattern.creational.factorymethod;

public class BulgogiPizza implements Pizza{
    @Override
    public void eat() {
        System.out.println("불고기 피자 냠냠 ~");
    }
}
