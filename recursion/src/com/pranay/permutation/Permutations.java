package com.pranay.permutation;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");
        System.out.println((char)('a' + 3));
    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String e = p.substring(i, p.length());
            permutations(f + ch + e, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        ArrayList<String> arr = new ArrayList<>();

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String e = p.substring(i, p.length());
            arr.addAll(permutationsList(f + ch + e, up.substring(1)));
        }

        return arr;
    }

    static int permutationsCount(String p, String up){
        if(up.isEmpty()){

            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String e = p.substring(i, p.length());
            count += permutationsCount(f + ch + e, up.substring(1));
        }

        return count;
    }
}
