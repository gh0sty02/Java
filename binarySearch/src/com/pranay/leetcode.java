package com.pranay;

import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {


//        System.out.println();

//        [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
//20


    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);

        }

        return ans;

    }

//    static char ceiling(char[] letters, int target) {
//        int start = 0;
//        int end = letters.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//
//            }
//
//        }
//        return letters[start % letters.length];
//    }

    static int search(int[] arr, int target, boolean isStartIndex) {
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(isStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}