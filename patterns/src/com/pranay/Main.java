package com.pranay;

public class Main {

    public static void main(String[] args) {
	// write your code her
        pattern6(4);
    }

    static void pattern1(int n ){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n ){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n ){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= n - 1- row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n ){
        for (int row = 0; row <= 2 * n ; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            for (int col = 0; col <= totalCols; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n ){
        for (int row = 0; row <= 2 * n ; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int spaces = n - totalCols;


            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= totalCols; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n ; row++) {


            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row < 2* n  ; row++) {

            int c = row > n ? 2 * n - row : row;

            for (int spaces = 0; spaces < n - c; spaces++) {
                System.out.print(" ");
            }

            for (int col = c; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int origianlN = n;
         n = 2 * n;
        for (int row = 0; row <=n  ; row++) {
            for (int col = 0; col <= n ; col++) {
                int atEveryIndex = origianlN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }
}
