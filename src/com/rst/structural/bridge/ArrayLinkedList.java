package com.rst.structural.bridge;

public class ArrayLinkedList<T> implements LinkedList<T> {
    @Override
    public void addFirst(T element) {
        System.out.println("add first array linked list");
    }

    @Override
    public T removeFirst() {
        System.out.println("remove first array linked list");
        return null;
    }

    @Override
    public void addLast(T element) {
        System.out.println("add last array linked list");
    }

    @Override
    public T removeLast() {
        System.out.println("remove last array linked list");
        return null;
    }

    @Override
    public int getSize() {
        System.out.println("get size array linked list");
        return 0;
    }
}
