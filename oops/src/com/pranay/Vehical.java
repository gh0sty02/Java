package com.pranay;

public class Vehical {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    Vehical(String name, String size) {

        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }



    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Vehicle.steer() steering the Vehicle at " + currentDirection +" degrees");
    }

    public void move(int direction, int velocity){
        this.currentDirection = direction;
        this.currentVelocity += velocity;

        System.out.println("Vehicle.move() Moving Vehicle at "+currentVelocity + " in direction at "+ currentDirection +
                " degrees");
    }
    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
