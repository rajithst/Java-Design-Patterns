package com.rst.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        OrderPrinter summaryPrinter = new SummaryPrinter();
        PrintService service = new PrintService(summaryPrinter);
        service.printOrders();

        DetailedPrinter detailedPrinter = new DetailedPrinter();
        PrintService service2 = new PrintService(detailedPrinter);
        service2.printOrders();
    }
}
