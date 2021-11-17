package com.pranay.problems;

import java.util.ArrayList;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }


        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < (digit * 3) ; i++) {
            char ch = (char)('a' + i);
            pad(p + ch , up.substring(1));
        }
    }


    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        ArrayList<String> arr = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < (digit * 3) ; i++) {
            char ch = (char)('a' + i);
            arr.addAll(padList(p + ch , up.substring(1)));
        }
        return arr;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){

            return 1;
        }

        int count = 0;

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < (digit * 3) ; i++) {
            char ch = (char)('a' + i);
            count += padCount(p + ch , up.substring(1));
        }

        return count;
    }
}
