package com.pranay;

public class House {

    private Bed bed;
    private Cupboard cupboard;
    private Table table;

    public House(Bed bed, Cupboard cupboard, Table table) {
        this.bed = bed;
        this.cupboard = cupboard;
        this.table = table;
    }

    public void goToSleep(){
        goToHouse();
        bed.sleep();
    }


    public void goToHouse(){
        System.out.println("Going to the House");
    }

}

