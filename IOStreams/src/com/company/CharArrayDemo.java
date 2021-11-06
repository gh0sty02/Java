package com.company;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayDemo {
    public static void main(String[] args) throws IOException {
        char[] arr = {'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};
        CharArrayReader car = new CharArrayReader(arr);
        int x;
        while((x = car.read()) != -1){
            System.out.print((char)x);
        }

        System.out.println();

        CharArrayWriter caw = new CharArrayWriter(20);
        caw.write('a');
        caw.write('b');
        caw.write('c');
        caw.write('d');
        caw.write('e');
        caw.write('f');

        CharArrayWriter caw2 = new CharArrayWriter();

        caw.writeTo(caw2);
        System.out.println(caw2);
        caw.flush();

    }
}
