package com.pranay;


import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {


//
//        int a = 2;
//        int b = 3;
//        swap(2,3); // pass by reference i.e new objects are created
//        System.out.println(a + " " + b);
        ////////////////////////////////////////////////////////////////////////

        int[] arr = {1,2,3,4,5};
        changeArr(arr); // pass by value of reference variable of the object, hence the main object is changed
        System.out.println(Arrays.toString(arr));
    }

    private static void changeArr(int[] arr) {
        arr[1] = 23;
    }


//    private static void swap(int n1, int n2) {
//        int temp = n2;
//        n2 = n1;
//        n1 = temp;
//    }

}
