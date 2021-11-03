package com.pranay;

import java.util.*;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        triangle2(4, 0);
        int[] arr = {4,2,3,1};
        selection(arr, arr.length , 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }
    }

    public static void triangle2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            triangle2(r, c+1);
            System.out.print("*");

        }else{
            triangle2(r-1, 0);
            System.out.println();

        }
    }

     static void bubble(int[] arr, int r, int c ){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                swap(arr, c, c+1);
            }
            bubble(arr, r, c+1);

        }else{
            bubble(arr, r-1, 0 );
        }
     }

     static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
     }

     static void selection(int[] arr, int r, int c , int max){
        if(r==0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[max]){
                selection(arr, r, c+ 1, c);
            }else{
                selection(arr, r, c+1, max);
            }
        }else{
            swap(arr, max, r-1);
            selection(arr, r-1, 0 , 0);
        }
     }
}
