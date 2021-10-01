package com.pranay;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "White", "Bacon & Sausage", 15.99);
        super.addHamburgerAddition1("Chips", 2.50);
        super.addHamburgerAddition2("Drinks", 3.00);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add Addition Item to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add Addition Item to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add Addition Item to Deluxe Burger");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add Addition Item to Deluxe Burger");

    }
}
