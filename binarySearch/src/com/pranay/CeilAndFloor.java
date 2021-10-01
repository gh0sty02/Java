package com.pranay;

public class CeilAndFloor {
    public static void main(String[] args) {
        int[] arr = {1,2,6,34,45, 50, 57};
        int target = 0;
//        System.out.println(ceiling(arr, target));
        System.out.println(floor(arr, target));

    }
    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(target > arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }

    static int floor(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(target < arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
