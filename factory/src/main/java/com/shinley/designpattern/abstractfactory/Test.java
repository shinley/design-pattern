package com.shinley.designpattern.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        Car c =factory.createCar();
        c.run();
        AK47 ak = factory.createAK47();
        ak.shoot();

        Apple a = factory.createApple();
        a.printName();
    }
}
