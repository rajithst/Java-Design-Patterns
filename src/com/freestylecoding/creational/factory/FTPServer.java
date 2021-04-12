package com.freestylecoding.creational.factory;

public class FTPServer implements IServer {
    @Override
    public void Resolve() {
        System.out.println("Solving FTP server conflicts");
        System.out.println("Finish FTP Server");
    }

    @Override
    public void Degugger() {
        System.out.println("Debugging FTP server");
    }
}
