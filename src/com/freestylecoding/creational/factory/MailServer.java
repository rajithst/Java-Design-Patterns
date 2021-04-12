package com.freestylecoding.creational.factory;

public class MailServer implements IServer{

    @Override
    public void Resolve() {
        System.out.println("Resolving conflicts for Mail server");
        System.out.println("Finished mail server..");
    }

    @Override
    public void Degugger() {
        System.out.println("Debugging Mail Server");
    }
}
