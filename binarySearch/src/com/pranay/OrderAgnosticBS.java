package com.pranay;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1,2,34,6,45, 50, 57};
        int[] arr = {100, 89, 72, 66, 54,45, 32, 8 , 2 , -2 };

        int target = 45;
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid]== target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
