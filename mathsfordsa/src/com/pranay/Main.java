package com.pranay;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println(isOdd(3));

//        int[] arr = {2, 3, 5, 5, 2};
//        System.out.println(findUniqueInArray(arr));
        System.out.println(powerOf2(8));
    }

    static boolean powerOf2(int n){
        return (n&(n-1)) == 0;
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    static int findUniqueInArray(int[] arr){
        int unique = 0;
        for (int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
