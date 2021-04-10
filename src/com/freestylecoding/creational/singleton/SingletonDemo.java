package com.freestylecoding.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        singletonLazily();
    }

    public static void singleton() {
        DBInstance instanceOne = DBInstance.getInstance();
        System.out.println(instanceOne);

        DBInstance instanceTwo = DBInstance.getInstance();
        System.out.println(instanceTwo);
    }

    public static void singletonLazily() {
        System.out.println("Singleton Lazily -- ");
        DBInstanceLazyLoad instanceOne = DBInstanceLazyLoad.getInstance();
        System.out.println(instanceOne);

        DBInstanceLazyLoad instanceTwo = DBInstanceLazyLoad.getInstance();
        System.out.println(instanceTwo);
    }
}
