package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListSortDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("S");
        arr.add("W");
        arr.add("A");
        arr.add("J");
        arr.add("I");

        Comparator<String> c1 = Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        Collections.sort(arr, c1);


        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(Collections.binarySearch(arr, "E"));
    }
}
