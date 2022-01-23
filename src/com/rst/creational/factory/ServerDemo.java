package com.rst.creational.factory;

public class ServerDemo {
    public static void main(String[] args) {
        IServer server = ServerFactory.getServer(ServerTypes.MAIL);
        server.Resolve();
        server.Degugger();

        IServer server1 = ServerFactory.getServer(ServerTypes.FTP);
        server1.Resolve();

    }
}
