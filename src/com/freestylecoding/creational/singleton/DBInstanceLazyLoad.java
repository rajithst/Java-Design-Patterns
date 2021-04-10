package com.freestylecoding.creational.singleton;

public class DBInstanceLazyLoad {

    private DBInstanceLazyLoad() {
    }

    private static DBInstanceLazyLoad instance = null;

    public static DBInstanceLazyLoad getInstance() {
        if (instance == null){
            instance = new DBInstanceLazyLoad();
        }
        return instance;
    }

}
