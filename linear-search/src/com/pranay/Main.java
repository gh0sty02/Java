package com.pranay;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,67,234,8565,123,332,235,745};
        int target = 745;

        System.out.println(linearSearch(arr, target));

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }
}
