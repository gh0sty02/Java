package com.pranay;

public class IndexInMountainArray {
    public static void main(String[] args) {

    }
    public int findInMountainArray(int target, int[] arr) {
        int peak = search(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length-1);
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

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){


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
