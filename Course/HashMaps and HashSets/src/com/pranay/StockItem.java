package com.pranay;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock=0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0){
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {

        System.out.println("Executing equals()");
        if(this == obj){
            return true;
        }

        if((obj == null) || this.getClass() != obj.getClass()){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.getName().equals(objName);

    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + 32;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Executing comparable");
        if (this == o) {
            return 0;
        }
            if (o != null) {
                return this.getName().compareTo(o.getName());
            }

            throw new NullPointerException();


    }

    @Override
    public String toString() {
        return this.name + " price : " + this.getPrice();
    }
}
