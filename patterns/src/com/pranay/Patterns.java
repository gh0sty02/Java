package com.pranay;

import java.util.Arrays;
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] arr = new String[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = " ";


            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = "*";

                }
            }
        }

        for (String[] subArray : arr) {
            System.out.println(Arrays.toString(subArray));
        }

//        pattern1(arr);
    }


//    static void pattern1(String[][] arr,int n){
//
//       [][] newArr = new arr[n][n];
//    }
}
