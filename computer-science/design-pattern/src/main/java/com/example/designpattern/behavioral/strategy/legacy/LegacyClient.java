package com.example.designpattern.behavioral.strategy.legacy;

public class LegacyClient {
    public static void main(String[] args) {

        MoveSystem moveSystem = new MoveSystem(MoveSystem.Strategy.WALK);
        moveSystem.Move(); //걸어 가기... 뚜벅뚜벅

        moveSystem.setStrategy(MoveSystem.Strategy.BUS);
        moveSystem.Move(); //버스 타고 가기... 삑!

        moveSystem.setStrategy(MoveSystem.Strategy.BICYCLE);
        moveSystem.Move(); //자전거 타고 가기... 따릉따릉
    }

}
