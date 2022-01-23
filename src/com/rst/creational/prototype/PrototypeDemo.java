package com.rst.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("Movie");
        movie.setTitle("Peaky Blinders");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie)registry.createItem("Movie");
        anotherMovie.setTitle("Prison Break");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getUrl());


    }
}
