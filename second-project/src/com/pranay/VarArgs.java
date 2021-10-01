package com.pranay;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multipleArgs(2,3,4,5,6,7);
    }
    static void multipleArgs(int a , int b, int ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
