package com.rst.behavioral.strategy;

public class SummaryPrinter implements OrderPrinter{

    @Override
    public void print() {
        System.out.println("Printing summary report");
    }
}
