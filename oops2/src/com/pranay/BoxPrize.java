package com.pranay;

public class BoxPrize extends BoxWeight{
    int price;

    public BoxPrize(float length, float width, float height, float weight, int price) {
        super(length, width, height, weight);
        this.price = price;
    }

    public BoxPrize(float weight, int price) {
        super(weight);
        this.price = price;
    }

    public BoxPrize(){
        this.price = -1;
    }

}
