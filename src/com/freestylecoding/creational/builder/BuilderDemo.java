package com.freestylecoding.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.addBread("brown")
                .addCondiments("something")
                .addMeat("pork");

        LunchOrder order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getMeat());
        System.out.println(order.getDressing());
    }
}
