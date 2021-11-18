package com.pranay;

import java.util.Arrays;
import java.util.Collections;

public class Leetcode3 {
    public static void main(String[] args) {
//        System.out.println(subtractProductAndSum(234));
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

//        System.out.println(sort(arr));
    }

    static int subtractProductAndSum(int n ){
        int sum = 0;
        int product = 1;
        while(n > 0){
            int digit = n % 10;
            n/= 10;
            sum += digit;
            product *= digit;
        }

        return product - sum;
    }

    static int sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;

            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;

        }
        return nums.length+1;
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void rotate(int[] nums, int k){
        if(nums.length < 2){
            return;
        }
        k = k % nums.length;

        reverse(nums, 0 , nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k , nums.length - 1);
    }
    static void reverse(int[] arr, int l, int h){
        while(l <= h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }


}
