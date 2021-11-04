package com.company;

import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(100);
        t.add(200);
        t.add(300);
        t.add(400);
        System.out.println(t.ceiling(200));
        System.out.println(t.higher(200));
        System.out.println(t.floor(200));
        System.out.println(t.lower(200));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast() );
        System.out.println(t.descendingSet());
    }
}
