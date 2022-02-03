package com.rst.behavioral.state;

public class NewState implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("Order is new,no processing done");
        return 0;
    }
}
