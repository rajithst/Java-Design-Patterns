package com.rst.structural.decorator;

public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message message){
        this.msg = message;
    }

    @Override
    public String getContent() {
        return "Html encoded messge of " + msg.getContent();
    }
}
