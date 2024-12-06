package com.example.designpattern.behavioral.strategy.refactor;

public class MoveSystem {
    private MoveStrategy moveStrategy;

    public MoveSystem(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        moveStrategy.move();
    }
}
