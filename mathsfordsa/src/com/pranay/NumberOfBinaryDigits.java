package com.pranay;

public class NumberOfBinaryDigits {
    public static void main(String[] args) {
        int n = 6;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
