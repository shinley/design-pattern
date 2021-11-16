package com.shinley.designpattern.decorator.drink;

public class Test {
    public static void main(String[] args) {
        // 纯豆浆
        Drink soya= new Soya();
        System.out.println(soya.money());
        System.out.println(soya.desc());

        // 加入红豆
        RedBean redBean = new RedBean(soya);
        System.out.println(redBean.money());
        System.out.println(redBean.desc());

        // 加入糖
        Sugar sugar = new Sugar(redBean);
        System.out.println(sugar.money());
        System.out.println(sugar.desc());
    }
}
