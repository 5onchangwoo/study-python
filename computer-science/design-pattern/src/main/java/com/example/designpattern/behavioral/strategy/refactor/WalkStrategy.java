package com.example.designpattern.behavioral.strategy.refactor;

public class WalkStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("걸어 가기... 뚜벅뚜벅");
    }
}
