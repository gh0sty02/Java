package com.pranay;

public class Main {

    public static void main(String[] args) {
	// write your code here
        print(1);
    }

    static void print(int n ){
        if(n == 6){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

}
