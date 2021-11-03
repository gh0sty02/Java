package com.company;

import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(3);
        l.add(5);
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        l.addFirst(1);
        l.addLast(7);
        l.add(null);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l);

    }
}
