package com.pranay;

import java.util.Scanner;

public class QuestionsClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(prime(n));

        ///////////////////////////////

//        System.out.println(isArmstrongNum(in.nextInt()));

        for (int i = 1; i <= 50000; i++) {
            if(isArmstrongNum(i)){
                System.out.print(i + " ");
            }
        }
    }

     static boolean prime(int n) {
        if(n == 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if( n % c == 0){
                return false;
            }
            c++;
        }
        return c*c >= n;

    }

    static boolean isArmstrongNum(int n){
        int ogNum = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int cubeRem = rem * rem * rem;
            sum += cubeRem;
            n /= 10;


        }

        return ogNum==sum;
    }
}
