package com.pranay;

public class MyThread extends Thread {

    public void start(){
        super.start();
        System.out.println("My start method");
    }

    public void run(){
        System.out.println("Run method");
    }
}
