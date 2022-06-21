package com.bridgelabz.linkedlist;

public class LinkedList <T> {
    Node<T> head;
    Node<T> tail;

    void add(Node<T> newNode) {
        if (head == null) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
    }

    public void display() {
        System.out.println();
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
    }
    public void push(Node<T> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void pop(){
        head = head.next;
    }
}