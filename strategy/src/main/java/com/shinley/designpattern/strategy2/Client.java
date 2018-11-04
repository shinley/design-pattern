package com.shinley.designpattern.strategy2;

public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerFewStrategy();
        Context ctx = new Context(s1);
        ctx.printPrice(998);
    }

}
