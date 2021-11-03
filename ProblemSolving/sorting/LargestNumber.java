package com.pranay;

public class LargestNumber {
    public static void main(String[] args) {
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        reverse("eat");

    }
    static void reverse(String str){
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i > 0; i--) {
            System.out.println(charArray[i] + " ");
        }
    }
}
