package com.rst.behavioral.strategy;

public class DetailedPrinter implements OrderPrinter{

    @Override
    public void print() {
        System.out.println("Printing detailed report");
    }
}
