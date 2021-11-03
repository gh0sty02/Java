package com.pranay;

import java.util.Arrays;

public class Findingin2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,1,5},
                {22,45,12,98,21},
                {65,42,90}
        };

        int target = 12;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

     static int[] search(int[][] arr, int target) {

         for (int j = 0; j < arr.length; j++) {
             for (int k = 0; k < arr[j].length; k++) {
                 if(arr[j][k] == target){
                     return new int[]{j,k};
                 }
             }
         }



         return new int[]{-1,-1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        // normal for loop
//        for (int j = 0; j < arr.length; j++) {
//            for (int k = 0; k < arr[j].length; k++) {
//                if(arr[j][k] > max){
//                    max = arr[j][k];
//                }
//            }
//        }

        // for each loop

        for(int[] arr1 : arr){
            for(int v : arr1){
                if(v > max){
                    max = v;
                }
            }
        }


        return max;
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;

        // normal for loop
//        for (int j = 0; j < arr.length; j++) {
//            for (int k = 0; k < arr[j].length; k++) {
//                if(arr[j][k] < min){
//                    min = arr[j][k];
//                }
//            }
//        }

        // for each loop

        for(int[] arr1 : arr){
            for(int v : arr1){
                if(v < min){
                    min = v;
                }
            }
        }

        return min;
    }
}
