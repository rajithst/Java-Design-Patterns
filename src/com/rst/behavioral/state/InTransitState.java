package com.rst.behavioral.state;

public class InTransitState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting delivery service for cancellation");
        System.out.println("Contacting payment gateway to rollback the payment");
        return 20;
    }
}
