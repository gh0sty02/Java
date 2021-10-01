package com.pranay;

public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumberNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double num){
        this.firstNumber = num;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return   this.secondNumber-this.firstNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        return this.firstNumber / this.secondNumber;
    }
}
