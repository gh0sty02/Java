package com.pranay;

public class BoxWeight extends  Box{
    float weight;

    public BoxWeight(float length, float width, float height, float weight) {
        super(length, width, height);
        this.weight = weight;
    }
    BoxWeight(float weight){
        this.weight = weight;
    }

    BoxWeight(){
        this.weight = -1;
    }

}
