package com.pranay;

import java.util.Scanner;

public class Loops {
    public static void main(StringFunctions[] args) {

//       for(int num = 0; num <= 5; num++){
//           System.out.println(num);
//       }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = input.nextInt();
        System.out.println(n);

//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }

        int i = 1;
        while(i <= n){
            System.out.println("Hello World");
            i++;
        }
    }
}
