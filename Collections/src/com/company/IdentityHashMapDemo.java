package com.company;

import java.util.*;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> h = new IdentityHashMap<>();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        h.put(i1, "hello");
        h.put(i2, "Me");
        System.out.println(h);
    }
}
