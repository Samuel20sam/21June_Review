package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type three integer");
        int x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> fn = new Node<>(x1);
        Node<Integer> sn = new Node<>(x2);
        Node<Integer> tn = new Node<>(x3);

        System.out.println("Add method");
        list.add(fn);
        list.add(sn);
        list.add(tn);
        list.display();
//        System.out.println("Push method");
//        list.push(fn);
//        list.push(sn);
//        list.push(tn);
//        list.display();
        System.out.println("\n\nPop method");
        list.pop();
        list.display();
    }
}