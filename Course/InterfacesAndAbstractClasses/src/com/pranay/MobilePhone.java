package com.pranay;

public class MobilePhone implements ITelephone{
    boolean isOn = false;
    private int myPhone;
    private boolean isRinging;

    public MobilePhone(int myPhone) {
        this.myPhone = myPhone;
    }

    @Override
    public void powerOn() {
        System.out.println("Turning On, Please Wait...");
        this.isOn = true;
        System.out.println("Phone turned On...");

    }

    @Override
    public void dail(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber+"... ");
        }else{
            System.out.println("Phone is Switched Off.");
        }
    }


    @Override
    public void answer() {
        if(isRinging && isOn){
            System.out.println("Answering the Call...");
        }else{
            System.out.println("Phone is Switched Off..");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myPhone && isOn){
            isRinging = true;
            System.out.println("Plays Genius by Sia..");
        }else{
            isRinging= false;
            System.out.println("Phone Switched Off or Different Number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
