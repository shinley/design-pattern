package com.shinley.design.creational.spring.factory;

public class Train implements Moveable {
    @Override
    public void run() {
        System.out.println("小火车呜呜呜......");
    }
}
