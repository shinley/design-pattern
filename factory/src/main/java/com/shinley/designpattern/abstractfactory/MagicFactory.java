package com.shinley.designpattern.abstractfactory;

public class MagicFactory extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food creteFood() {
        return new Mushroom();
    }
}
