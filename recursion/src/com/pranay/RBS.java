package com.pranay;

public class RBS {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(rbs(arr, 10, 0, arr.length - 1));
    }

    static int rbs(int[] arr, int target, int s, int e ){
        if(s > e){
            return -1;
        }

        int mid = s + (e - s) / 2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return rbs(arr, target, s, mid - 1);
            }else{
                return rbs(arr, target, mid + 1, e);
            }
        }

        if(target >= arr[mid] && target <= arr[e]) {
            return rbs(arr, target, mid + 1, e);
        }else{
            return rbs(arr, target, s, mid - 1);
        }
        }
}
