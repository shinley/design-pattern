package com.shinley.designpattern.abstractfactory;

public class DefaultFactory {
    public Car createCar() {
        return new Car();
    }

    public AK47 createAK47() {
        return new AK47();
    }

    public Apple createApple() {
        return new Apple();
    }

}
