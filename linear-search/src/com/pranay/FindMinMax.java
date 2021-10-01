package com.pranay;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {23,1,123,12,56,21,2};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]> ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
