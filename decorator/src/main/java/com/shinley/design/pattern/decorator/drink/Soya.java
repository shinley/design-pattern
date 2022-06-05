package com.shinley.design.pattern.decorator.drink;

// 被装饰者
public class Soya implements Drink{
    @Override
    public double money() {
        return 5;
    }

    @Override
    public String desc() {
        return "纯豆";
    }
}
