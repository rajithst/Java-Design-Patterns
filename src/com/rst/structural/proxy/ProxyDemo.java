package com.rst.structural.proxy;

import javafx.geometry.Point2D;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("ABC.bpm");
        image.setLocation(new Point2D(10,10));
        image.getLocation();
        image.render();
        image.getLocation();

    }
}
