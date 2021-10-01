package com.pranay;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(2);

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        //// initialisation for 2d arraylist
        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }

        // adding items

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2);
    }
}
