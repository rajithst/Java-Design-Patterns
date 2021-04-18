package com.freestylecoding.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Item> items = new HashMap<String,Item>();

    public Registry(){
        loadItems();

    }

    public Item createItem(String type){
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }


    private void loadItems(){

        Movie movie = new Movie();
        movie.setTitle("Star Wars");
        movie.setPrice(299);
        movie.setRuntime("2 hours");
        items.put("Movie",movie);

        Book book = new Book();
        book.setTitle("Design Patterns");
        book.setPrice(199);
        book.setNumberOfPages(100);
        items.put("Book",book);
    }
}
