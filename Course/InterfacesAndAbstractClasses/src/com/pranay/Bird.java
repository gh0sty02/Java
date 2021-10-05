package com.pranay;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);

    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating ");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in.");
    }

    public abstract void fly();
}
