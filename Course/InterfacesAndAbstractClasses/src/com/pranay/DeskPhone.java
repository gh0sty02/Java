package com.pranay;

public class DeskPhone implements ITelephone{
    private int myPhone;
    private boolean isRinging;

    public DeskPhone(int myPhone) {
        this.myPhone = myPhone;
    }

    @Override
    public void powerOn() {
        System.out.println("No action performed, DeskPhone phone does not have a power button");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber+"... ");
    }

    @Override
    public void answer() {
    if(isRinging){
        System.out.println("Answering the Call...");
    }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myPhone){
            isRinging = true;
            System.out.println("Ring Ring.. " );
        }else{
            isRinging= false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
