package com.pranay;

public class SplitArray {
    public static void main(String[] args) {

        int[] arr = {1,4,4};
        int target = 3;
        System.out.println(splitArray(arr, target));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        // apply binary search
        while(start < end){
            // try to find the middle potential ans;
            int mid = start + (end - start) /2;

            // calc number of pieces

            int pieces = 1;
            int sum = 0;

            for(int num: nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }


}
