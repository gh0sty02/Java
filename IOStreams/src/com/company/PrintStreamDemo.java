package com.company;

import java.io.*;



public class PrintStreamDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("student.txt");
        PrintStream ps = new PrintStream(fos);

        FileInputStream fin = new FileInputStream("student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));


        Student s1 = new Student("Pranay", 56, "CSE");
        ps.println(s1.name);
        ps.println(s1.rollno);
        ps.println(s1.Branch);


        String name = br.readLine();
        int roll = Integer.parseInt(br.readLine());
        String branch = br.readLine();
        System.out.println(name + " " + roll + " " + branch);
    }
}
