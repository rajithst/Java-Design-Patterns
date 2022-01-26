package com.rst.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Message message = new TextMessage("Hello world");
        System.out.println(message.getContent());

        Message newMessage = new HtmlEncodedMessage(message);
        System.out.println(newMessage.getContent());

        Message newMessage2 = new Base64EncodedMessage(newMessage);
        System.out.println(newMessage2.getContent());

    }
}
