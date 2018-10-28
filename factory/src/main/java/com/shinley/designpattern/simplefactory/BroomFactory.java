package com.shinley.designpattern.simplefactory;

public class BroomFactory extends VehicleFactory {
    public Moveable create() {
        return new Broom();
    }
}
