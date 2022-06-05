package com.shinley.design.creational.simplefactory;

public class CarFactory extends VehicleFactory {
    public Moveable create() {
        return new Car();
    }
}
