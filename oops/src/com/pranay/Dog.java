package com.pranay;

public class Dog extends Animal {
    private int tail;
    private int eyes;
    private String coat;

    public Dog(int tail, int eyes, String coat){
        super(1, 1);
        this.tail = tail;
        this.eyes = eyes;
        this.coat = coat;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("method overriden");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }
}
