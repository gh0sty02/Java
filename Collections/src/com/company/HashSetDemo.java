package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> h = new LinkedHashSet<>();
        h.add("Hello");
        h.add("3");
        h.add("GG");
        System.out.println(h.add("2"));
        System.out.println(h);
    }
}
