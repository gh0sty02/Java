package com.company;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw");
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        System.out.println(raf.getFilePointer());
        raf.write('d');
        System.out.println((char)raf.read());
        raf.seek(3);
        System.out.println((char)raf.read());

    }
}
