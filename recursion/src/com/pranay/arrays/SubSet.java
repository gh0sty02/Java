package com.pranay.arrays;

import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = subsetDuplicate(new int[]{1,2,2});
        for(ArrayList<Integer> i : arr){
            System.out.println(i);
        }
    }

    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    static ArrayList<ArrayList<Integer>> subsetDuplicate(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int s = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            s = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                s = e + 1;
            }
            e = outer.size() - 1;
            int n = outer.size();
            for (int j = s; j < n; j++) {

                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(inner);
            }
        }

        return outer;
    }
}
