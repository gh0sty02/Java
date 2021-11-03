package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Leetcode {
    public static void main(String[] args) {
       int[] arr1 = { -1,0,3,5,9,12};
//        int[] arr2 = {2,2};
//       System.out.println( getProgrammerDay(1918));
        System.out.println(bs(arr1, 9));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    arr1.add(nums2[j]);
                }
            }
        }

        System.out.println(arr1);


        int[] arr = new int[arr1.size()];
        int index = 0;
        for(Integer i : arr){
            arr[index++] = i;
        }
        return arr;


    }

    static int[] intersect(int[] list1, int[] list2){
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i : list1){
            if(!map.containsKey(i)){
                map.put(i , 1);
            }else{
                map.put(i , map.get(i)+1);
            }
        }

        int n = 0;
        for(int i : list2){
            if(map.containsKey(i) && map.get(i) > 0){
                list2[n++] = i;
                map.put(i, map.get(i) - 1 );
            }
        }

        return Arrays.copyOfRange(list2, 0, n );
    }

    static String getProgrammerDay(int year){
        boolean leap = ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0);
        int[] arr = {31, leap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31};

        int sum = 256;
        int month = 1;
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum > 0){
                month = i + 1;
                rem += arr[i];
                sum -= arr[i];
            }
        }
        rem -= arr[month - 1];


        String str = String.format("%d.%02d.%d",266 - rem, month, year);

        return str;


    }

    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;

    }
}
