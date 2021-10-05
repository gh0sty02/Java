package com.pranay;

public class Main {
    public static void main(String[] args) {

        Dog doggo = new Dog("Charlie");
        doggo.eat();
        doggo.breathe();


        Penguin penguin = new Penguin("Alex");
        penguin.eat();
        penguin.breathe();
        penguin.fly();

        Sparrow sparrow = new Sparrow("Arron");
        sparrow.eat();
        sparrow.breathe();
        sparrow.fly();
    }

}
