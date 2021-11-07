package com.company;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file.dat");
        FileInputStream fis = new FileInputStream("file.dat");
        DataInputStream dis = new DataInputStream(fis);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(56);
        dos.writeUTF("Pranay");
        dos.writeUTF("CSE");

        dos.close();

        int roll = dis.readInt();
        String name = dis.readUTF();
        String branch = dis.readUTF();
        System.out.println(name + " " + roll + " "+ branch);
    }
}
