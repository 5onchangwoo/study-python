package com.example.designpattern.creational.abstractfactory;

public class Beer implements Drink {
    @Override
    public void drink() {
        System.out.println("맥주 꿀꺽꿀꺽");
    }
}
