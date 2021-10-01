package com.pranay;

public class Outlander extends  Car{

    private int roadService;

    public Outlander(int roadService ) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int currentSpeed = getCurrentVelocity() + rate;

        if(currentSpeed == 0){
            stop();
        }else if(currentSpeed > 0 && currentSpeed <= 10){
            changeGear(1);
        }else if(currentSpeed > 10 && currentSpeed <= 20){
            changeGear(2);
        }else if(currentSpeed > 20 && currentSpeed <= 30){
            changeGear(3);
        }else{
            changeGear(4);
        }

        if (currentSpeed > 0) {
            {
                changeVelocity(currentSpeed, getCurrentDirection());
            }
        };
    }
}
