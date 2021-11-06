package com.company;

import java.io.*;
import java.io.FileWriter;
import java.util.Arrays;

public class Streams {

    public static void main(String[] args)  {
        // write your code here

        try(FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt");
            FileInputStream fin1 = new FileInputStream("file1.txt");
            FileInputStream fin2 = new FileInputStream("file2.txt")
        ){
            String s = "HELLO PROGRAMMER, THIS IS A CHALLENGE \nAPPROACH TO YOU SAFE ZONES \nand GOOD LUCK COMRADE !";
            s+="\nGood Work Comrade";
            fos1.write(s.getBytes());

            byte[] f1 = new byte[fin1.available()];
            fin1.read(f1);
            String s1 = new String(f1);
            System.out.println(s1);

            fos2.write(f1);

        }catch (Exception e ){
            System.out.println(e);
        }



    }
}
