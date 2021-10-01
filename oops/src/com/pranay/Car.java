package com.pranay;

public class Car extends Vehical {
    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int doors, int wheels, int gears, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): set the current gear to "+ this.currentGear +" gear");
    }

    public void changeVelocity(int velocity, int direction){
        move(direction, velocity);

        System.out.println("Car.changeVelocity : changed the velocity to "+ velocity + " in direction "+ direction);
    }



}
