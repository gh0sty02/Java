package com.pranay;

public class Penguin extends Bird{

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void fly() {
        System.out.println("I'm not good at that bro, can I walk pls ?");
    }

    public Penguin(String name) {
        super(name);
    }
}
