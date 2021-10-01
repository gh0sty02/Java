package com.pranay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {

    public static void main(String[] args) {

//        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5 ,24, 42};
        int[] arr1 =  {3, 10, 2, 9};


        List<Integer> arr = new ArrayList<>(arr1.length){};
        for (int i = 0; i < arr1.length; i++) {
            arr.add(i, arr1[i]);
        }

        bonAppetit(arr, 1, 12);

//        int k = 5;
//        System.out.println(migratoryBirds(5,arr));



    }



    static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(i == j){
                    sumLeftToRight += arr.get(i).get(j);
                }
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if((i+j) == arr.size() - 1){
                    sumLeftToRight += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(sumLeftToRight + sumRightToLeft);
    }

    static List<Integer> minMax(List<Integer> arr){

        int minCount = 0;
        int maxCount = 0;
        int minRecord = arr.get(0) , maxRecord= arr.get(0);
        List<Integer> ans = new ArrayList<Integer>(2);

        for (int i = 0; i < arr.size(); i++) {

            if( i+1 < arr.size() && arr.get(i+1) > maxRecord){
                if(maxRecord == arr.get(i+1) || minRecord == arr.get(i+1)){
                    continue;
                }
                maxRecord = arr.get(i+1);
                maxCount++;
            }else if(i+1 < arr.size() && arr.get(i+1) < minRecord){
                minRecord = arr.get(i+1);
                minCount++;
            }
        }

        ans.add(0, maxCount);
        ans.add(1, minCount);

        return ans;
    }

    static int divisibleSumPairs(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i] + arr[j])%k == 0){
                    System.out.println( arr[i] + " " + arr[j] );
                    count++;
                }
            }
        }
        return count;
    }

    static int migratoryBirds(int n , List<Integer> arr){
        int ans = 1;
        int max = 0;
        List<Integer> counter = new ArrayList<Integer>(6);



        for (int i = 0; i < 6; i++) {
            counter.add(0);
        }


        for (int i = 0; i < arr.size(); i++) {
            int pos = arr.get(i);
            int value = counter.get(pos)+1;
//            counter[ar[i]]++;
            counter.set(pos,value);
        }
        System.out.println(counter);
        for (int i = 0; i <= 5 ; i++) {
            if(counter.get(i) > max){
                ans = i ;
                max = counter.get(i);
            }
        }
        return ans;
    }

    static int divideSubarray(List<Integer> s, int d, int m){
//        int max_sum = 0;
//
//        int count = 0;
//        for (int i = 0; i < k; i++) {
//            max_sum += arr.get(i);
//        }
//        if(max_sum == n) count++;
//
//        int  window_sum = max_sum;
//
//
//        // slide to next elemnts
//        for (int i = k; i < arr.size(); i++) {
//            if(max_sum == n) count++;
//            window_sum = window_sum - arr.get(i - k) + arr.get(i) ;
//            max_sum = Math.max(max_sum, window_sum);

        int sum = 0,ways=0;
        for (int i=0;i<m;i++){
            sum += s.get(i);
        }
        for (int i=0;i<s.size()-m+1;i++) {
            if (sum==d) {
                ways++;
            }
            if (i+m <s.size()){
                sum =sum-s.get(i)+s.get(i+m);
            }
        }
        return ways;

        }

     static void bonAppetit(List<Integer> bill, int k, int paidBill) {
        // Write your code here
         int totalBill = 0;
         for (int i = 0; i < bill.size(); i++) {
             if(i == k) continue;
             totalBill += bill.get(i);
         }

         int sharedBill = totalBill / 2;

         if(paidBill == sharedBill) System.out.println("Bon Appetit");
         else System.out.println(paidBill - sharedBill);



    }



//        return count;



}
