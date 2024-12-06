package com.example.designpattern.behavioral.strategy.refactor;

public class MyCarStrategy implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("내차를 타고 가기... 부릉부릉");
    }
}
