package com.pranay;

import java.util.Scanner;

public class Fibo {
    public static void main(StringFunctions[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number to Calculate Fibonacci no: ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.print(b);
    }
}
