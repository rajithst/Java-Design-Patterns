package com.rst.behavioral.templatemethod;

import java.util.Map;

public class TextOrder extends OrderPrinter{

    @Override
    protected String start() {
        return "------------- Order Summary ---------------";
    }

    @Override
    protected String formatOrder(Order order) {
        return "Order #"+order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder stringBuilder = new StringBuilder("Items \n-------------------------\n");
        for (Map.Entry<String,Double> entry:order.getItems().entrySet()){
            stringBuilder.append(entry.getKey()+" $"+entry.getValue()+"\n");
        }
        stringBuilder.append("--------------------------");
        return stringBuilder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total: $"+order.getTotal();
    }

    @Override
    protected String end() {
        return "----------------//-----------------------";
    }
}
