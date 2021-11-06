package com.company;

import java.io.*;

public class ByteArrayDemo {
    public static void main(String[] args) throws Exception {
        byte[] arr = {'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};

        ByteArrayInputStream bis = new ByteArrayInputStream(arr);
        int x;
        while((x = bis.read()) != -1){
            System.out.print((char) x);
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');

        bos.writeTo(new FileOutputStream("byteArray.txt"));
        bos.close();
    }
}
