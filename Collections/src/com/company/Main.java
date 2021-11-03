package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SortedSet<Student> cl = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.rollno < s2.rollno){
                    return 1;
                }else if(s1.rollno > s2.rollno){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        cl.add( new Student("Alex", 21));
        cl.add( new Student("Max", 22));
        cl.add( new Student("Jonas", 11));
        cl.add( new Student("Lee", 41));
        cl.add( new Student("James", 24));


//        System.out.println("A".compareTo("Z"));
//        System.out.println("Z".compareTo("A"));
//        System.out.println("Z".compareTo("Z"));

//        for(Student s : cl){
//            System.out.println(s.name + " " + s.rollno);
//        }

        SortedSet<Integer> ints = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return 0;
            }

        });

        ints.add(3);
        ints.add(1);
        ints.add(5);
        for(Integer i : ints){
            System.out.println(i);
        }

        SortedSet<Employee> company = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                if(o1.id > o2.id){
//                    return -1;
//                }else if(o1.id < o2.id){
//                    return 1;
//                }else {
//                    return 0;
//                }
                return -o1.compareTo(o2);
            }
        });
        company.add(new Employee(100, "Nigga"));
        company.add(new Employee(200, "Chad"));
        company.add(new Employee(300, "Smith"));
        company.add(new Employee(400, "Jame"));
        company.add(new Employee(100, "Alex"));

        for(Employee e : company){
            System.out.println(e);
        }

    }


}
