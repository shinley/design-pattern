package com.shinley.design.pattern.decorator.drink;

public class RedBean extends Decorator{

    public RedBean(Drink drink) {
        super(drink);
    }

    @Override
    public double money() {
        return super.money() + 3.2;
    }

    @Override
    public String desc() {
        return super.desc() + "+ 红豆";
    }
}
