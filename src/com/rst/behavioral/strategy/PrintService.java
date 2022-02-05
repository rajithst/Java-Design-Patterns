package com.rst.behavioral.strategy;

public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(){
        printer.print();
    }
}
