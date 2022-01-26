package com.rst.structural.decorator;

public class Base64EncodedMessage implements Message{

    private Message msg;

    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return "Base 64 encoded message of " + msg.getContent();
    }
}
