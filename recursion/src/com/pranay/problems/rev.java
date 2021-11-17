package com.pranay.problems;

public class rev {
    static int sum;

    static void reverse1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum  * 10 + rem;
        reverse1(n/10);
    }



    static int helper1(int n, int digits){
        if(n % 10 == n){
            return n;
        }

        int rem = n % 10;

        return rem * (int)(Math.pow(10, digits - 1)) + helper1(n/10, digits - 1);
    }

    static int rev2(int n){
        int digits = (int) (Math.log10(n)) + 1  ;

        return helper1(n, digits);
    }

    static int numberOfZeros(int n){
        return helper(n, 0);

    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

    static int gcd(int n1, int n2){
        if(n1 == 0){
            return n2;
        }

        return gcd(n2 % n1, n1);

    }

    public static void main(String[] args) {
//        System.out.println(numberOfZeros(10204));
        System.out.println(gcd(357,234));
    }
}
