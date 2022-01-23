package com.rst.structural.bridge;

public class SinglyLinkedList<T> implements LinkedList<T> {
    @Override
    public void addFirst(T element) {
        System.out.println("add first from singly linked list");
    }

    @Override
    public T removeFirst() {
        System.out.println("remove first singly linked list");
        return null;
    }

    @Override
    public void addLast(T element) {
        System.out.println("add last singly linked list");
    }

    @Override
    public T removeLast() {
        System.out.println("remove last singly linked list");
        return null;
    }

    @Override
    public int getSize() {
        System.out.println("get size singly linked list");
        return 0;
    }
}
