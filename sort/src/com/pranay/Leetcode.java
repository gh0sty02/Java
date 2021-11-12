package com.pranay;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        System.out.println(isPowerOf4(16));
    }

    static int duplicateNum(int[] num){
        int unique = 0;
        for(int i : num){
            unique ^= i;
        }
        return unique;
    }

    static int slidingExp(int[] arr){
        int anchor = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i-1] >= arr[i]) anchor = i;
            result = Math.max(result, i - anchor + 1);
        }
        return result;
    }

    static String reverseStr(String s, int k ){
        if(s.length() == 0 || s.length() ==1){
            return s;
        }

        if(s.length() < k){
            return revereString(s,s.length());
        }else if(s.length() < 2*k){
            return revereString(s, k);
        }else{
            int length = s.length();
            return revereString(s.substring(0, 2*k), k) + revereString(s.substring(2*k, length), k);
        }
    }



    static String revereString(String s, int n){

        int low = 0;
        int high = n - 1;
        char[] arr = s.toCharArray();

        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return new String(arr) ;
    }

    static void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int fibo(int n ){
        if(n <= 1){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    static boolean isPowerOf2(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }

    static boolean isPowerOf3(int n){
        if(n == 0) return false;
        if(n == 1) return  true;
        if(n % 3 == 0) return isPowerOf3(n /3);
        else return false;
    }

    static boolean isPowerOf4(int n){
        if(n == 0) return false;
        if(n == 1) return  true;
        if(n % 4 == 0) return isPowerOf4(n /4);
        else return false;
    }


}
