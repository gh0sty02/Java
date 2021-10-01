package com.pranay;

import java.util.Arrays;

public class ReverseStringWords {
    public static void main(String[] args) {
        String s = "a good   example";

        System.out.println(reverseWords(s));


    }
    static String reverseWords(String s) {
        StringBuilder strbld = new StringBuilder();
        String[] strArr = s.split(" ");
//        System.out.println(Arrays.toString(strArr));
        for (int i = strArr.length-1 ; i >= 0 ; i--) {
            if(strArr[i].equals("")){
                continue;
            }
            strbld.append(strArr[i].trim() + " ");
        }

        return strbld.toString().trim();
    }



}
