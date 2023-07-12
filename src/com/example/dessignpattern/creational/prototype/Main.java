package com.example.dessignpattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Clonable 사용 예시 ===");
        Prototype prototype = new Prototype("난 프로토 타입이지롱");
        System.out.println("prototype = " + prototype);
        Prototype clone1 = prototype.clone();
        System.out.println("clone1 = " + clone1);

        /* 필드 변경하기 */
        Prototype clone2 = prototype.clone();
        clone2.setName("난 특별해");
        System.out.println("clone2 = " + clone2);

        /* Cloneable 객체를 사용하지 않았을 때 */
        System.out.println("=== Cloneable 객체를 사용하지 않은 예시 ===");
        BulgogiPizza pizza = new BulgogiPizza();
        pizza.setName("불고기 피자");
        pizza.setSize("large");
        pizza.setPrice(24000);
        pizza.setBulgogiCount(50);
        System.out.println("pizza = " + pizza);

        /* 불고기 피자 객체 복사 */
        BulgogiPizza BulgogiPizzaClone = pizza.clone();
        BulgogiPizzaClone.setSize("medium"); // 원하는 필드만 변경하여 사용
        System.out.println("BulgogiPizzaClone = " + BulgogiPizzaClone);

    }
}
