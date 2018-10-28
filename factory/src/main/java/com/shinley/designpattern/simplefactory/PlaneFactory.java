package com.shinley.designpattern.simplefactory;

public class PlaneFactory extends VehicleFactory {
    public Moveable create() {
        return new Plane();
    }
}
