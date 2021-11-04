package com.company;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> n = new TreeMap<>();
        n.put(100, "A");
        n.put(200, "B");
        n.put(300, "C");
        n.put(400, "D");

        System.out.println(n.floorKey(200));
        System.out.println(n.lowerKey(200));
        System.out.println(n.higherKey(200));
        System.out.println(n.ceilingKey(200));
        System.out.println(n.pollFirstEntry());
        System.out.println(n.pollLastEntry());
        System.out.println(n.descendingMap());
    }
}
