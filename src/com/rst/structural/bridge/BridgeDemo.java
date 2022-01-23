package com.rst.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(20);
        collection.offer(30);

        FifoCollection<String> stringCollection = new Queue<>(new ArrayLinkedList<>());
        stringCollection.offer("hello");
        stringCollection.offer("mello");
    }
}
