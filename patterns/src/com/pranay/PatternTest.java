package com.pranay;

public class PatternTest {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n){
//        for (int row = 1; row < 2 * n; row++) {
//            int totalCols = row > n ? n * 2 - row : row;
//            for (int col = 1; col <= totalCols; col++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

        for (int row = 1; row <= n ; row++) {

            for (int spaces = 0; spaces < n - row  ; spaces++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= row * 2 - n   ; i++) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces <=  row   ; spaces++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

}
