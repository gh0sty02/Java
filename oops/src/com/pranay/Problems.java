package com.pranay;

public class Problems {
    public static void main(String[] args) {

        System.out.println(digitExtractor(12));
    }

    static int digitExtractor(int n  ) {
        int count = 0;
        int target = n;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit == 0) continue;
            if (target % digit == 0) count++;

        }
        return count;


    }
//    static int minSubarrayLength(int[] arr, int target){
//
//    }

}
