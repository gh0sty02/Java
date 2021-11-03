package com.pranay;

import java.util.Arrays;
import java.util.Scanner;

public class SortingRefresher {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {4,5,2,1,};
        int[] arrCyclic = {3,2,3,1,2,4,5,5,6};

        cyclicSort(arrCyclic);

        System.out.println(Arrays.toString(arrCyclic));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = maxIndex( arr, 0 , lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int maxIndex(int[] arr, int start, int end){
        int max = 0;
        for (int i = start ; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }

        }

        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static int[] getIntegers(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }



    static void sortIntegers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
}


