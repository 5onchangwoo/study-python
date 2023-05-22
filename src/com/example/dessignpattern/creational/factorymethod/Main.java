package com.example.dessignpattern.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        // 불고기 피자 생성
        PizzaCreator factory1 = new BulgogiPizzaCreator(2);
        Pizza bulgogiPizza1 = factory1.createPizza();
        bulgogiPizza1.eat();
        Pizza bulgogiPizza2 = factory1.createPizza();
        bulgogiPizza2.eat();
            // 세개는 피자가 없어서 못먹음 ㅜ
        Pizza bulgogiPizza3 = factory1.createPizza();
        bulgogiPizza3.eat();

        // 콤비네이션 피자 생성
        PizzaCreator factory2 = new CombinationPizzaCreator(1);
        Pizza combinationPizza1 = factory2.createPizza();
        combinationPizza1.eat();
            // 두개부턴 못먹어요 ㅜㅜ
        Pizza combinationPizza2 = factory2.createPizza();
        combinationPizza2.eat();
    }
}
