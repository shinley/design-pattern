package com.shinley.designpattern.abstractfactory;

public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();

    public abstract Food creteFood();
}
