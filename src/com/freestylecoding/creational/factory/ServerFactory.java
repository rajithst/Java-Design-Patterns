package com.freestylecoding.creational.factory;

public class ServerFactory {

    public static  IServer getServer(String serverType){
        switch (serverType){
            case "mail":
                return new MailServer();
            case "ftp":
                return new FTPServer();
            default:
                return null;
        }
    }
}
