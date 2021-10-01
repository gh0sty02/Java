package com.pranay;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        System.out.println(find(arr));
    }

    static List<Integer> find(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return  ans;
    }

        static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

}
