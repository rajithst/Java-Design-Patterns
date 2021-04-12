package com.freestylecoding.creational.factory;

public class ServerDemo {
    public static void main(String[] args) {
        IServer server = ServerFactory.getServer("mail");
        server.Resolve();
        server.Degugger();

        IServer server1 = ServerFactory.getServer("ftp");
        server1.Resolve();

    }
}
