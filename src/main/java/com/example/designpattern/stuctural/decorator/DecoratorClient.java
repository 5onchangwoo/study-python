package com.example.designpattern.stuctural.decorator;

import com.example.designpattern.stuctural.decorator.coffee.Coffee;
import com.example.designpattern.stuctural.decorator.coffee.Espresso;
import com.example.designpattern.stuctural.decorator.decorator.MilkDecorator;
import com.example.designpattern.stuctural.decorator.decorator.SugarDecorator;

public class DecoratorClient {
    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        System.out.println("에스프레소의 가격은 " + espresso.cost());

        Coffee sugarEspresso = new SugarDecorator(espresso);
        System.out.println("설탕이 추가된 에스프레소의 가격은 " + sugarEspresso.cost());

        Coffee milkSugarEspresso = new MilkDecorator(sugarEspresso);
        System.out.println("우유와 설탕이 추가된 에스프레소의 가격은 " + milkSugarEspresso.cost());

    }
}
