package com.rst.behavioral.templatemethod;

import java.io.IOException;
import java.io.PrintWriter;

public abstract  class OrderPrinter {

    public final void printOrder(Order order,String filename) throws IOException {
        try(PrintWriter writer = new PrintWriter(filename)){
            writer.println(start());
            writer.println(formatOrder(order));
            writer.println(formatItems(order));
            writer.println(formatTotal(order));
            writer.println(end());
        }
    }

    protected abstract String start();

    protected abstract String formatOrder(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotal(Order order);

    protected abstract String end();



}
