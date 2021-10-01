package com.pranay;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();

        System.out.println(isPalindrome(n));

    }

     static int isPalindrome(int n) {
        int reversed = 0;
        if (n < 0){
            n = -n;
        }
        while(n > 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n /= 10;
        }
        return -reversed;
    }


}