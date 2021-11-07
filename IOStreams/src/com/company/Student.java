
package com.company;


import java.io.Serializable;

class Student implements Serializable {
    public String name;
    public int rollno;
    public String Branch;

    public Student(String name, int rollno, String branch) {
        this.name = name;
        this.rollno = rollno;
        Branch = branch;
    }
}
