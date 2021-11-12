package com.pranay;

public class Square extends Shapes{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("I'm in square");
    }
}
