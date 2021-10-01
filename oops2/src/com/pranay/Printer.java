package com.pranay;

public class Printer {
    private double tonerLevel;
    private boolean isDuplex;
    private int pagesPrinted;

    public Printer(double tonerLevel, boolean isDuplex, int pagesPrinted) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        this.pagesPrinted = pagesPrinted;
    }

    public void increaseTonerLevel(double percentage){
        if(percentage > 0 && percentage <= 100 && percentage + this.tonerLevel < 100){
            this.tonerLevel += percentage;
        }else{
            this.tonerLevel = -1;
        }
    }

    public void printPage(int numOfPages){
        double tonerForOnePage;
        if(this.isDuplex){
             tonerForOnePage = 1;
        }else{
            tonerForOnePage = 0.5;
        }

        if(tonerForOnePage * numOfPages  < this.tonerLevel){
            if(this.isDuplex){
                this.pagesPrinted += numOfPages / 2;
            }else{
                this.pagesPrinted += numOfPages;
            }
            this.tonerLevel -= numOfPages * tonerForOnePage;
            System.out.println("Printing "+ numOfPages + " pages, please wait !");
            System.out.println("Done");
        }else{
            System.out.println("Printer is out of Toner, please fill the toner to continue");
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
