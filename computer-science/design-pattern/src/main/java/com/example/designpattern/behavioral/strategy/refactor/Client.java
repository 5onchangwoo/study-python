package com.example.designpattern.behavioral.strategy.refactor;

public class Client {
    public static void main(String[] args) {
        MoveSystem moveSystem = new MoveSystem(new WalkStrategy());
        moveSystem.move(); //걸어 가기... 뚜벅뚜벅

        moveSystem.setMoveStrategy(new BicycleStrategy());
        moveSystem.move(); //자전거 타고 가기... 따릉따릉

        moveSystem.setMoveStrategy(new MyCarStrategy());
        moveSystem.move(); //내차를 타고 가기... 부릉부릉
    }
}
