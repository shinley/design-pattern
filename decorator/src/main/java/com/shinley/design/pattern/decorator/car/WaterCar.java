package com.shinley.design.pattern.decorator.car;

public class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水上游。。。");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
