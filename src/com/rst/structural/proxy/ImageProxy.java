package com.rst.structural.proxy;
import javafx.geometry.Point2D;

public class ImageProxy implements Image{

    private BitmapImage image;
    private String name;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if(image!=null){
            System.out.println("setting image location in actual object");
            image.setLocation(point2D);
        }else{
            System.out.println("setting image location in proxy");
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        if(image!=null){
            System.out.println("getting location from actual object");
            return image.getLocation();
        }
        System.out.println("getting location from proxy");
        return location;
    }

    @Override
    public void render() {
        if(image==null){
            System.out.println("Creating actual Image object");
            image = new BitmapImage(name);
            if (location!=null){
                image.setLocation(location);
            }
        }
        System.out.println("call render method in actual image object");
        image.render();
    }
}
