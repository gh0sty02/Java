package com.pranay;

import java.util.Arrays;

public class Leetcode2 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static int[] addOne(int[] digits){
        if(digits.length == 0){
            return new int[]{1};
        }
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return  digits;
    }

    public static String addBinary(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while(i >=0 || j >= 0){
            int sum = carry;
            if(i >= 0 )sum += s1.charAt(i) - '0';
            if(j >= 0) sum += s2.charAt(j) - '0';
            sb.append(sum%2);
            carry = sum /2;

            i--;
            j--;
        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
