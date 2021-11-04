package com.company;

import java.util.Arrays;
import java.util.List;

public class ArrayConversionDemo {
    public static void main(String[] args) {
        String[] arr = {"A", "Z", "E", "T"};
        List<String> l = Arrays.asList(arr);
        // throws unsupportedOperationException
//        l.add("C");

        
        l.set(2, "W");

        System.out.println(l);

    }

}
