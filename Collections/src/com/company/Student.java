package com.company;

public class Student  {
    public final String name;
    public final int rollno;

    public Student(String name, int roll){
        this.name = name;
        this.rollno = roll;
    }

//    @Override
//    public int compareTo(Student s) {
//        if(this.rollno > s.rollno){
//            return 1;
//        }else if(this.rollno < s.rollno){
//            return -1;
//        }else{
//            return 0;
//        }
//    }
}
