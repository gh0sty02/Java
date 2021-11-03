package com.company;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> t = new TreeMap<>();

        t.put(new Employee(100, "Pranay"), 100);
        t.put(new Employee(101, "Aniket"), 101);
        t.put(new Employee(102, "Idk"), 102);
        t.put(new Employee(103, "Omkar"), 103);

        System.out.println(t);
    }
}
