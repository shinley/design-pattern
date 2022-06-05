package com.shinley.design.creational.simplefactory;

public class PlaneFactory extends VehicleFactory {
    public Moveable create() {
        return new Plane();
    }
}
