package com.pranay;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int currentGear = 0;
    private int maxGears;
    private boolean clutchIsIn;


    public Gearbox( int maxGears) {
        this.gears = new ArrayList<Gear>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i <= maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 &&  (number <= maxGears)){
            this.gears.add(new Gear(number, ratio));
        }else{
            System.out.println("GRRRRRRRRRRRRRRRRRRRRRRRRRRRr");
        }
    }

    public void changeGear(int newGear){
        if(newGear >= 0 && (newGear < this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else{
            System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrrr");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrrrrr");
            return 0.0;
        }

        return revs * gears.get(currentGear).getRatio();
    }

    public int getCurrentGear() {
        return currentGear;
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double currentSpeed(int gearNumber){
            return gearNumber * this.ratio;
        }
    }
}
