package com.pranay;

import java.util.Arrays;
import java.util.Scanner;

public class BSrevisited {
    public static void main(String[] args) {

//


        Scanner in = new Scanner(System.in);

        int totalElements = in.nextInt();

        int largestSale = in.nextInt();

        int[] arr = new int[totalElements];

        for (int i = 0; i < totalElements; i++) {
            arr[i] = in.nextInt();
        }

        bubbleSort(arr);
        System.out.println(arr[arr.length  - largestSale]);


    }

    static void bubbleSort(int[] arr){
        // loop will run n-1 times;
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            } if(!isSwapped){
                break;
            }
        }

    }

    static int findInRotatedArray(int[]arr, int target){
        int pivot = findPivot(arr);


        if(pivot == -1){
            // this means the array is not rotated
            return BS(arr, target, 0 , arr.length);
        }

        if(arr[pivot] == target){
            return target;

        }

         if(target >= arr[0]){
            return BS(arr, target, 0, pivot - 1 );
        }
            return BS(arr, target,  pivot - 1, arr.length - 1);

    }

    static int findPivotInDuplicateArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid]< arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end;

                }
                end--;
            }else{
                if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid] )){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            if(arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//            if(arr[mid]< arr[mid - 1]){
//                return mid - 1;
//            }
//
//            if(arr[start] >= arr[mid]){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] < arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int peakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < start && arr[mid] > arr[mid + 1]){
                // this means we are in descending part of the array, and mid may be the answer
                end = mid;
            }else  {
                // this means we are in the ascending part of the array, and as mid < mid + 1, ans lie to left
                // from mid
                start = mid + 1;
            }

            // return start / end as both point towards the same element at last because ?
            // at any given time, start and end will have the best possible ans till that iteration, and it
            // they point at same element thus it should  be the ans

        }
        return start;
    }

    static int findRange(int[]arr, int target){
        int start = 0;
        int end = 1;

        if(target > arr[end]){
            int newS = end + 1;
             end = end + (end - start + 1) * 2;
            start = newS;
        }

        return BS(arr, target, start, end);
    }

    static int[] startAndEndIndex(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);

        return ans;
    }

    static int search(int[] arr, int target, boolean startIndex ){
        int start = 0;
        int end = arr.length -1 ;
        int ans = -1;

        while(start<= end){
        int mid = start + (end - start) / 2;
        if(target > arr[mid]){
            start = mid + 1;
        }
        else if(target < arr[mid]){
            end = mid - 1;
        }
        else{
            ans = mid;
            if(startIndex){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        }
        return ans;
    }

    static int BS(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
