package com.example.dessignpattern.creational.abstractfactory;

public class CombinationPizza implements Pizza {
    @Override
    public void eat() {
        System.out.println("콤비네이션 피자 냠냠");
    }
}
