package com.pranay;


class Student{

    String name;
    int rollno;
    float marks;

    Student(int roll, String studentName, float studentMarks){
        name = studentName;
        rollno = roll;
        marks = studentMarks;
    }
}

public class Main {


    public static void main(String[] args) {
        Student s = new Student(56, "Pranay", 87.2f);
        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println(s.rollno);
    }
}
