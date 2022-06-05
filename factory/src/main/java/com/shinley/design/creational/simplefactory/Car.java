package com.shinley.design.creational.simplefactory;

public class Car implements Moveable {
    private static Car car = new Car();

    public Car() {

    }

    public static Car getInstance() {
        return car;
    }

    public void run() {
        System.out.println("冒着烟奔跑中car......");
    }
}
