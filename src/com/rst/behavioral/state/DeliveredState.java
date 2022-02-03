package com.rst.behavioral.state;

public class DeliveredState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting delivery service to pick the item");
        System.out.println("Contacting payment gateway to rollback the payment");
        return 30;
    }
}
