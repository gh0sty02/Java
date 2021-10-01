package com.pranay;

import java.util.Arrays;
import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//         swap 2 items in array

        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }


    ///////////////////////////////////

        // reverse the array

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(arr);
    }




        //////////////////////////////

        //// find the largest element in array
//        int[] arr = {1,2, 323, 21, 456, 7};
//
//        System.out.println(largest(arr));
//    }
//
//    static int largest(int[] arr){
//        if(arr.length == 0){
//            return -1;
//        }
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;

        // find max item in given range of array

//        int[] arr = {1,2, 323, 21, 456, 7};
//
//        System.out.println(largestBetweenRange(arr, 0, 3));
//    }
//
//    static int largestBetweenRange(int[] arr, int start, int end){
//        int max = arr[0];
//
//        if(end > start){
//            return -1;
//        }
//
//        if(arr == null){
//            return -1;
//        }
//
//        for (int i = start; i < end; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;

}
