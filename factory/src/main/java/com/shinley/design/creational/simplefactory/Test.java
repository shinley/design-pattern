package com.shinley.design.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Car c = Car.getInstance();
//        Car c2 = Car.getInstance();

        VehicleFactory factory = new PlaneFactory();
        Moveable m = factory.create();

//        if (c == c2) { System.out.println("same car");
        m.run();
    }
}
