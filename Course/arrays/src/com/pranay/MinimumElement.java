package com.pranay;

import java.util.*;




public class MinimumElement {

    public static void main(String[] args) {

        int[] arr = {2,1,3,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int readInteger(){
        Scanner in = new Scanner(System.in);
        int noOfElements = in.nextInt();
        return noOfElements;

    }

    static int[] readElements(int noOfElements){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }


}
