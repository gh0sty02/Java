package com.pranay;

public class Motherboard {
    private String model;
    private String bios;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;

    public Motherboard(String model, String bios, String manufacturer, int ramSlots, int cardSlots) {
        this.model = model;
        this.bios = bios;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String program){
        System.out.println("Loading Program : " + program);
    }

    public String getModel() {
        return model;
    }

    public String getBios() {
        return bios;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
