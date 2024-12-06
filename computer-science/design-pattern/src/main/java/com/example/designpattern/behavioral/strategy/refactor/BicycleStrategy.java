package com.example.designpattern.behavioral.strategy.refactor;

public class BicycleStrategy implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("자전거 타고 가기... 따릉따릉");
    }
}
