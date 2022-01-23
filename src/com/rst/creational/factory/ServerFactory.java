package com.rst.creational.factory;

public class ServerFactory {

    public static  IServer getServer(ServerTypes serverType){
        switch (serverType){
            case MAIL:
                return new MailServer();
            case FTP:
                return new FTPServer();
            default:
                return null;
        }
    }
}
