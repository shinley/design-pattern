package com.shinley.design.creational.simplefactory;

public class BroomFactory extends VehicleFactory {
    public Moveable create() {
        return new Broom();
    }
}
