package com.pranay;

public class PeekElementInMountainArray {
    public static void main(String[] args) {

    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        // we can return start or end any of those as start and end will point to only one element when the condtion for
//        breaking the while loop i.e start < end break. i.e they both will be equal
        return start;
    }
}
