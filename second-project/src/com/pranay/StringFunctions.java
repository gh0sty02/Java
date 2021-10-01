package com.pranay;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String name = in.next();
        String message = greet(name);
        System.out.println(message);
    }

     static String greet(String name){
        return ("Hello "+ name);
    }
}
