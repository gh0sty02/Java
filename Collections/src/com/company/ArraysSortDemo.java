package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 67, 12, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 1));

        String[] strs = {"A", "Z", "E", "T"};
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.binarySearch(strs, "K", new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }));
    }
}
