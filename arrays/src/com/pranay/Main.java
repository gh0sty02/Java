package com.pranay;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int[] rnos = new int[5];

//        for (int i = 0; i < rnos.length; i++) {
//            rnos[i] = in.nextInt();
//        }
//
//        for(int num : rnos){
//            System.out.print(num + " ");
//        }

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
