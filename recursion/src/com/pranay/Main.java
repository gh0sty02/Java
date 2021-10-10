package com.pranay;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOfDigits(1324));;
    }

    static void print(int n ){
        if(n == 6){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    static void rev(int n){
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
        rev(n - 1);
        System.out.print(n + " ");

    }

    static int fact(int n){
        if(n <= 1){
            return 1;
        }

        return n * fact(n - 1);
    }

    static int sumOfDigits(int n){
        if(n % 10 == n){
            return n;
        }

        return (n % 10 + sumOfDigits(n / 10));
    }

    static int revDigit(int n){
        if(n%10 == n){
            return n;
        }
        return (n % 10 + revDigit(n / 10));
    }

}
