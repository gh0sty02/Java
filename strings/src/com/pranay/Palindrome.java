package com.pranay;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        StringBuilder strbld = new StringBuilder();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            strbld.append(chars[i]);
        }
        System.out.println(strbld);
        System.out.println(palin(strbld.toString()));
    }

    static boolean palin(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
