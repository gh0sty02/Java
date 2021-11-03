package com.company;

public class Employee implements Comparable<Employee> {
    public int id;
    public String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }

    @Override
    public int compareTo(Employee e) {
        return -this.name.compareTo(e.name);
    }
}
