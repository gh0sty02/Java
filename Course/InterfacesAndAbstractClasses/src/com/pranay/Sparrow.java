package com.pranay;

public class Sparrow extends Bird{
    public Sparrow(String name) {
        super(name);
    }

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
        System.out.println("Weeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }
}
