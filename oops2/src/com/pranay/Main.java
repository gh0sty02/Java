package com.pranay;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new BoxWeight(2,2,1,5);
//        System.out.println(b1.width);
//
//        BoxPrize b2 = new BoxPrize(2, 1, 2, 2, 1);
//        System.out.println(b2.height);

        Shapes s = new Shapes();
        Circle c = new Circle();
        Shapes s1 = new Square(3);

        c.area();
        s.area();
        s1.area();
    }
}
