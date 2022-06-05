package com.shinley.design.pattern.decorator.car;

public class FlyCar extends  SuperCar{

    public FlyCar(ICar car) {
        super(car);

    }

    public void fly() {
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

}
