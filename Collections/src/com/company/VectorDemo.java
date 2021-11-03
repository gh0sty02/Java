package com.company;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(10, 5);
        System.out.println(v.capacity());

        for (int i = 0; i < 11; i++) {
            v.addElement(i);
        }
        v.add(56);
        System.out.println(v.capacity());
    }
}
