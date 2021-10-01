package com.pranay;

public class FindingElementInInfiniteArray {
    public static void main(String[] args) {
    int[] arr = {2, 3 ,4, 7, 23, 25, 29, 34, 65, 86, 99};
    int target = 23;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[]arr,int target, int start, int end){

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
        return -1;
    }
}
