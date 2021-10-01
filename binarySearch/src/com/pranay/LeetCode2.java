package com.pranay;

public class LeetCode2 {
    public static int shipWithinDays(int[] weights, int D) {
        int left = 0, right = 0;
        for (int w: weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, requirement = 1, tillnow = 0;
            for (int w: weights) {
                if (tillnow + w > mid) {
                    requirement += 1;
                    tillnow = 0;
                }
                tillnow += w;
            }
            if (requirement > D) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int d=5;
        int ans= shipWithinDays(arr,d);
        System.out.println(ans);
    }
//    static int squareRoot(int n){
//        long start = 0;
//        long end = n;
//        while(start + 1 < end){
//            long mid = start + (end - start )/2;
//            if(mid*mid == n){
//                return (int)mid;
//            }if(mid*mid > n){
//                end = mid;
//            }else{
//                start = mid;
//            }
//        }
//        if(end * end == n){
//            return (int)end;
//        }
//            return (int)start;
//
//    }
}
