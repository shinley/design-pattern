package com.shinley.design.pattern.decorator.drink;

public class Egg extends Decorator{

    public Egg(Drink drink) {
        super(drink);
    }

    @Override
    public double money() {
        return super.money() + 3.2;
    }

    @Override
    public String desc() {
        return super.desc() + " + 鸡蛋";
    }
}
