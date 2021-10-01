package com.pranay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

        countApplesAndOranges();
    }

    static void countApplesAndOranges(
//            int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges
    ) {



        int s = 2;
        int t = 3;
        int a = 1;
        int b = 5;
        int m = 1;
        int n = 1;
        int appleCount = 0;
        int orangeCount = 0;
        ArrayList<Integer> l1 = new ArrayList<>(m);
        l1.add(2);


        ArrayList<Integer> l2 = new ArrayList<>(n);

        l2.add(-2);



        ArrayList<Long> posApple = new ArrayList<>(m);
        ArrayList<Long> posOranges = new ArrayList<>(n);


        for (int i = 0; i < l1.size(); i++) {
            posApple.add(i, findPos(a, l1.get(i)));
        }

        for (int j = 0; j < l2.size(); j++) {
            posOranges.add(j, findPos(b, l2.get(j)));
        }


        for (Long integer : posApple) {
            if (s <= integer && integer <= t) {
                appleCount++;
            }
        }

        for (Long integer : posOranges) {
            if (s <= integer && integer <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

    static long findPos(long housePos, long fruitPos ){
        return housePos + fruitPos;
    }
}
