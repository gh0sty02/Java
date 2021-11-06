package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRW {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.println();
        System.out.println(br.readLine());
    }
}
