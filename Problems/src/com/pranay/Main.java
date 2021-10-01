package com.pranay;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//
////        String[] arr = {"flower", "flow", "flight"};
////
////        System.out.println(2&2);
//
//        double v1 = 20.00d;
//        double v2 = 80.00d;
//
//        double sum = ((v1 + v2) * 100.00d) % 40;
//
//        boolean isZero = sum == 0 ;
//
//        System.out.println(isZero);
//
//        if(!isZero){
//            System.out.println("Got Some Remainder");
//        }


        ////////////////////////////
//        int[] arr = {3,3};
//        int target = 6;
//        System.out.println(Arrays.toString(twoSum(arr, target)));



        ///////////////
//        ArrayList<Integer> list1 =  new ArrayList<>(Arrays.asList( 73, 67, 38, 33));
//        ArrayList<Integer> list2 =  new ArrayList<>();
//
//        for (Integer value : list1) {
//            int result = roundingGrade(value);
//            list2.add(result);
//        }
//
//        for (Integer integer : list2) {
//            System.out.println(integer);
//        }

        /////////////////////////////////////

//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//
//        merge(nums1, nums2, m  , n);
//        System.out.println(Arrays.toString(nums1));
//
//
////        insertionSort(nums1);
//
//        System.out.println(Arrays.toString(nums1));

        ////////////////////////////////////////////////

        int[] arr = {3, 2, 1};
        int counter = 3;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(counter == 0){
                return;
            }
            if(i < arr.length && arr[i] == arr[i+1]){
                continue;
            }

            if(arr[i] < arr[i+1]){
                max = arr[i+1];
                counter--;
            }

        }
        System.out.println(max);

    }

//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//    static void insertionSort(int[] arr){
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j > 0; j--) {
//                if(arr[j] < arr[j-1]){
//                    swap(arr, j, j-1);
//                }else{
//                    break;
//                }
//            }
//        }
//    }

    static void merge(int[] nums1, int[] nums2, int m, int n){
        for (int i = m; i < nums1.length; i++) {
            int counter = 0;
            while(counter < n){
                nums1[i] = nums2[counter];
                counter++;
                i++;
            }
        }
    }


    static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid == target){
                return target;
            }
            if(target > mid){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

//    static String longestCommonPrefix(String[] strs) {
//        // Longest common prefix string
//        StringBuilder longestCommonPrefix = new StringBuilder();
//        // Base condition
//        if (strs == null || strs.length == 0) {
//            return longestCommonPrefix.toString();
//        }
//        // Find the minimum length string from the array
//        int minimumLength = strs[0].length();
//        for (int i = 1; i < strs.length; i++) {
//            minimumLength = Math.min(minimumLength, strs[i].length());
//        }
//        // Loop for the minimum length
//        for (int i = 0; i < minimumLength; i++) {
//            // Get the current character from first string
//            char current = strs[0].charAt(i);
//            // Check if this character is found in all other strings or not
//            for (String str : strs) {
//                if (str.charAt(i) != current) {
//                    return longestCommonPrefix.toString();
//                }
//            }
//            longestCommonPrefix.append(current);
//        }
//        return longestCommonPrefix.toString();
//    }



//    static int[] twoSum(int[] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            int curr = arr[i];
//            for (int j = 0; j < arr.length; j++) {
//                if(i==j){
//                    continue;
//                }
//                if(arr[i] + arr[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

//    static int roundingGrade(int score) {
//        int ans, newScore;
//        if (score < 38) {
//            return score;
//        }
//        newScore = score;
//        while (newScore % 5 != 0) {
//            newScore++;
//        }
//        if (newScore - score < 3) {
//            ans = newScore;
//        } else {
//            ans = score;
//        }
//
//        return ans;
//    }
}

//       if(score <= 28){
//            return 0;
//        }
//        if(score % 5 < 3){
//            while(score % 5 != 0){
//                score++;
//            }
//        }
//        return score;
//    }