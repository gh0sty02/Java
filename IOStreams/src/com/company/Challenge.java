package com.company;

import java.io.*;

public class Challenge {
    public static void main(String[] args) throws Exception{
        // challenge 1 is to store floats into a file and retrive them one by one
        // challenge 2 is to store a object inside a file and then retrieve it.

        float[] arr = {21.2f, 32.2f, 43.5f, 45.80f, 98.56f, 69.420f};

        FileOutputStream fos1 = new FileOutputStream("challenge1.txt");
        DataOutputStream dos1 = new DataOutputStream(fos1);

        FileInputStream fis1 = new FileInputStream("challenge1.txt");
        DataInputStream din1 = new DataInputStream(fis1);

        for (int i = 0; i < arr.length; i++) {
            dos1.writeFloat(arr[i]);
        }

        dos1.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(din1.readFloat());
        }


        /////////////////////////////////////////////////////

        FileOutputStream fos2 = new FileOutputStream("challenge2.txt");
        ObjectOutputStream dos2 = new ObjectOutputStream(fos2);

        FileInputStream fis2 = new FileInputStream("challenge2.txt");
        ObjectInputStream din2 = new ObjectInputStream(fis2);

        Customer c1 = new Customer("Pranay", "812-121-2312");
        dos2.writeObject(c1);
        dos2.close();

        Customer c = (Customer) din2.readObject();

        System.out.println(c.customerId + " " + c.name + " " + c.phone);
    }
}
