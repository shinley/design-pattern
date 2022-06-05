package com.shinley.design.creational.abstractfactory;

public class DefaultFactory extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food creteFood() {
        return new Apple();
    }
}
