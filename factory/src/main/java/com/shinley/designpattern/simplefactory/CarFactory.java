package com.shinley.designpattern.simplefactory;

public class CarFactory extends VehicleFactory {
    public Moveable create() {
        return new Car();
    }
}
