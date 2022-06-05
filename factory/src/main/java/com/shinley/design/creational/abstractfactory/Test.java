package com.shinley.design.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new DefaultFactory();
//        AbstractFactory factory = new MagicFactory();
        Vehicle v =factory.createVehicle();
        v.run();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();

        Food food = factory.creteFood();
        food.printName();
    }
}
