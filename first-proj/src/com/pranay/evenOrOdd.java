package com.pranay;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int enteredInt = input.nextInt();
        if(enteredInt % 2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
