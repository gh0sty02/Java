package com.pranay;

import java.util.Arrays;

public class Assignment {
    public static void main(String args[]){
     int[] arr = {1,3,5,6};
     int target = 0;
      int result = binarySearch(arr, target);
        System.out.println(result);
    }
//    static int[] twoSum(int[] arr, int target) {
//
//        for (int i = 0; i < arr.length; i++) {
//            int curr = arr[i];
//            for (int j = i+1; j < arr.length; j++) {
//                if(curr + arr[j] == target){
//                    return new int[]{i+1, j+1};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

//    static int staircase(int n){
//        int count = 0;
//        if(n == 1){
//            return 1;
//        }
//        for (int i = 1; i <= n; i++) {
//            n-=i;
//            count++;
//        }
//        return count;
//    }



//    static boolean searchMatrix (int[][] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            int result = binarySearch(arr[i], target);
//            if(result != -1){
//                return true;
//            }
//        }
//        return false;
//    }


    static int binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
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
        return start ;
    }
}
