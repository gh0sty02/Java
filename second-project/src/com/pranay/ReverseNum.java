package com.pranay;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = in.nextInt();

        int reverse = 0;

        boolean isSingleDigit = Integer.toString(Math.abs(num)).trim().length() == 1;


        while(num > 0){
            int rem = num % 10;
            num /= 10;

            reverse = reverse * 10 + rem;


        }
        System.out.println(isSingleDigit);
        if(!isSingleDigit){


            System.out.println(reverse);
        }
    }
}
