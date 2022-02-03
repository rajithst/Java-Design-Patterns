package com.rst.behavioral.state;

public class Order {

    private OrderState currentState;

    public Order() {
        this.currentState = new NewState();
    }

    public double cancel(){
        double charge = currentState.handleCancellation();
        currentState = new Cancelled();
        return charge;
    }

    public void paymentSuccessful(){
        currentState = new PaidState();

    }

    public void dispatched(){
        currentState = new InTransitState();
    }

    public void delivered(){
        currentState = new DeliveredState();

    }
}
