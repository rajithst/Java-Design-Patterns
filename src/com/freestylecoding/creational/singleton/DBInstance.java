package com.freestylecoding.creational.singleton;

public class DBInstance {

    private DBInstance(){}

    private static DBInstance instance = new DBInstance();

    public static DBInstance getInstance() {
        return instance;
    }

}
