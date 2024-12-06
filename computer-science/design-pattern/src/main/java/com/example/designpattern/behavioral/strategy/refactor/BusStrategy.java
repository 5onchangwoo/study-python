package com.example.designpattern.behavioral.strategy.refactor;

public class BusStrategy implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("버스 타고 가기... 삑!");
    }
}
