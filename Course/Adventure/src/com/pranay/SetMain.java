package com.pranay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {


      String sen1 = "Hello today is a great day";
      String sen2 = "Hello this is ghosty";

      String[] sen1Array = sen1.split(" ");
      String[] sen2Array = sen2.split(" ");

        Set<String> sentence1 = new HashSet<>(Arrays.asList(sen1Array));
        Set<String> sentence2 = new HashSet<>(Arrays.asList(sen2Array));

        Set<String> symmetric = new HashSet<>(sentence1);
        sentence1.retainAll(sentence2);
//        for(String word : sentence1){
//            System.out.print(word + " ");
//        }

        Set<String> asymmetric1 = new HashSet<>(Arrays.asList(sen1Array));
        asymmetric1.removeAll(sentence2);
        for(String word : asymmetric1){
            System.out.print(word + " ");
        }
        System.out.println();

        Set<String> asymmetric2 = new HashSet<>(Arrays.asList(sen2Array));
        asymmetric2.removeAll(sentence1);
        for(String word : asymmetric2){
            System.out.print(word + " ");
        }

        System.out.println(sentence1.containsAll(sentence2) );
        System.out.println(sentence2.containsAll(sentence1));
    }
}
