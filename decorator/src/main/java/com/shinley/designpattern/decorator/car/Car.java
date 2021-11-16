package com.shinley.designpattern.decorator.car;

/**
 * 具体构件对象
 */
public class Car implements ICar {

    @Override
    public void move() {
        System.out.println("公路上跑。。。。");
    }
}
