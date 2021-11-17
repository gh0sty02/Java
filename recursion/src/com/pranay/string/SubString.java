package com.pranay.string;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
//        ArrayList<String> arr = subSeqList("", "abc");
//        System.out.println(arr);

        System.out.println(subSeqAsciiList("", "abc"));

    }

    // Q - Find all substrings of the given string and print them

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // Q - Find all substrings of the given string and return the arraylist containing all subsets without passing it as argument

    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqList(p + ch, up.substring(1));
        ArrayList<String> second = subSeqList(p, up.substring(1));

        first.addAll(second);
        return first;
    }

    // Q - Find all substrings of the given string with ascii values and return the arraylist containing all subsets without passing it as argument


    static ArrayList<String> subSeqAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiList(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiList(p, up.substring(1));
        ArrayList<String> third = subSeqAsciiList(p + (ch + 0), up.substring(1));


        first.addAll(second);
        first.addAll(third);
        return first;
    }

    static int numMatchingSubseq(String s, String[] words) {
        ArrayList<String> subStrs = subSeq("", s, new ArrayList<String>());
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(subStrs.contains(words[i])){
                count++;
            }
        }
        return count;
    }

    // Q - Find all substrings of the given string and return the arraylist containing all subsets


    static ArrayList<String> subSeq(String p, String up, ArrayList<String> arr){
        if(up.isEmpty()){
           arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1), arr);
        subSeq(p, up.substring(1), arr);

        return arr;
    }
}
