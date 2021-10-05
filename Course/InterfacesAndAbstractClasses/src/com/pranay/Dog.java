package com.pranay;

public class Dog extends  Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in");
    }
}