package com.pranay;

public class Cupboard {
    private int drawers;
    private int compartments;
    private int hangers;
    private int doors;

    public Cupboard(int drawers, int compartments, int hangers, int doors) {
        this.drawers = drawers;
        this.compartments = compartments;
        this.hangers = hangers;
        this.doors = doors;
    }

    public void addClothes(String item){
        System.out.println("Added "+item + " to the cupboard");
    }

    public int getDrawers() {
        return drawers;
    }

    public int getCompartments() {
        return compartments;
    }

    public int getHangers() {
        return hangers;
    }

    public int getDoors() {
        return doors;
    }
}
