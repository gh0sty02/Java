package com.pranay.dice;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceList( "",4));
//        dice("", 3);
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p + i, target - i);
        }
    }
    static ArrayList<String> diceList(String p, int target){
        if(target == 0){
            ArrayList<String> inner = new ArrayList<String>();
            inner.add(p);
            return inner;
        }

        ArrayList<String> arr = new ArrayList<>();


        for (int i = 1; i <= 6 && i <= target ; i++) {
            arr.addAll(diceList(p + i, target - i));
        }

        return arr;
    }

}
