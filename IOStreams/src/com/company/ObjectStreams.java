package com.company;

import java.io.*;

public class ObjectStreams {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream("file.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s1 = new Student("Pranay", 56, "CSE");
        oos.writeObject(s1);

        Student s = (Student) ois.readObject();

        System.out.println(s.name + " " + s.rollno + " " + s.Branch);

    }
}
