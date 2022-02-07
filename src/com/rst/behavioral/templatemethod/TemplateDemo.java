package com.rst.behavioral.templatemethod;

import java.io.IOException;

public class TemplateDemo {

    public static void main(String[] args) throws IOException {
        Order order = new Order("1001");
        order.addItem("Book",45);
        order.addItem("Watch",200);
        order.addItem("Soap",2);

        OrderPrinter printer = new TextOrder();
        printer.printOrder(order,"1001.txt");
    }
}
