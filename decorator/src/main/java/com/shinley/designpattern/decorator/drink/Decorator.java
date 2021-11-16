package com.shinley.designpattern.decorator.drink;

// 装饰器
public abstract class Decorator implements Drink{
    // 装饰器

    // 1. 抽象类
    // 2. 实现抽象组件接口
    // 3. 持有帛象接口的引用
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double money() {
        return drink.money();
    }

    @Override
    public String desc() {
        return drink.desc();
    }
}
