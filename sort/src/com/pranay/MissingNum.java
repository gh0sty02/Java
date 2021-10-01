package com.pranay;

public class MissingNum {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 5, 4, 0};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] ;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;

            }

        }
            return arr.length;
        }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
