package com.pranay;

public class Bed {
    private String matress;
    private Dimensions dimensions;
    private String Blanket;
    private int pillows;

    public Bed(String matress, Dimensions dimensions, String blanket, int pillows) {
        this.matress = matress;
        this.dimensions = dimensions;
        Blanket = blanket;
        this.pillows = pillows;
    }

    public void sleep(){
        System.out.println("Sleeping !!zzzzz");
    }

    public String getMatress() {
        return matress;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getBlanket() {
        return Blanket;
    }

    public int getPillows() {
        return pillows;
    }
}
