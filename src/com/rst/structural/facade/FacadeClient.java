package com.rst.structural.facade;

import com.rst.structural.facade.email.EmailFacade;

public class FacadeClient {

    public static void main(String[] args) {
        Order order = new Order("1000",100);
        EmailFacade facade = new EmailFacade();
        boolean result = facade.sendOrderEmail(order);
        System.out.println(result);
    }
}
