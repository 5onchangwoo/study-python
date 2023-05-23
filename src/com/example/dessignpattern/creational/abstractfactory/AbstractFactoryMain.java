package com.example.dessignpattern.creational.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        // 불고기 관련 피자, 파스타 생성
        Factory bulgogiFactory = new BulgogiFactory();
        Pizza bulgogiPizza1 = bulgogiFactory.createPizza();
        Pizza bulgogiPizza2 = bulgogiFactory.createPizza();
        Drink cola = bulgogiFactory.createDrink();

        bulgogiPizza1.eat();
        bulgogiPizza2.eat();
        cola.drink();

        // 콤비네이션 관련 피자, 파스타 생성
        Factory combinationFactory = new CombinationFactory();
        Pizza combinationPizza1 = combinationFactory.createPizza();
        Pizza combinationPizza2 = combinationFactory.createPizza();
        Drink beer = combinationFactory.createDrink();

        combinationPizza1.eat();
        combinationPizza2.eat();
        beer.drink();

    }

}
