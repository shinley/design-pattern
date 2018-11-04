package com.shinley.designpattern.strategy2;

/**
 * 负责和具全的策略类交互
 * 这样的话，具体的算法和直接的客户端调用分离了， 使得算法可以独立于客户端独立的变化
 */
public class Context {

    // 可以把策略对象注册进来
    private Strategy strategy; // 当前采用的算法对象

    // 可以通过构造器来注入
    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    // 可以通过set方法来注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("您的报价：" + strategy.getPrice(s));
    }

}
