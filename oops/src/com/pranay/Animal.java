package com.pranay;

public class Animal {

    private int body;
    private int brain;

    public Animal(int body, int brain) {
        this.body = body;
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void eat(){
        System.out.println("Animal.eat called");
    }

    public void move(int speed){
        System.out.println("animal.move() called");
    }


    public int getBrain() {
        return brain;
    }
}
