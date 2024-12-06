package com.example.designpattern.behavioral.strategy.legacy;

public class MoveSystem {
    public enum Strategy {
        WALK, BUS, BICYCLE, CAR
    }

    private Strategy strategy;

    public MoveSystem(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void Move() {
        if (strategy == Strategy.WALK) {
            System.out.println("걸어 가기... 뚜벅뚜벅");
        } else if (strategy == Strategy.BUS) {
            System.out.println("버스 타고 가기... 삑!");
        } else if (strategy == Strategy.BICYCLE) {
            System.out.println("자전거 타고 가기... 따릉따릉");
        } else if (strategy == Strategy.CAR) {
            System.out.println("내차를 타고 가기... 부릉부릉");
        } else {
            System.out.println("어떻게 갈지 정하지 않았어!!");
        }
    }

}
