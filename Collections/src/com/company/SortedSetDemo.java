package com.company;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet(2));
        System.out.println(s.tailSet(2));
        System.out.println(s.subSet(2, 4));
    }
}
