package com.shinley.designpattern.decorator.car;

public class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove() {
        System.out.println("自动驾驶");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
