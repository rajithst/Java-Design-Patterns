package com.rst.behavioral.state;

public class PaidState implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("Contacting Payment gateway to rollback payment");
        return 10;
    }
}
