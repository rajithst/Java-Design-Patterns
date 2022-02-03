package com.rst.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {

        Order order = new Order();
        order.paymentSuccessful();
        order.dispatched();
        order.delivered();
        double charge = order.cancel();
        System.out.println(charge);
    }
}
