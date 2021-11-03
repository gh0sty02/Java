package com.company;

public class MyThread extends Thread {
    @Override
    public void run() {
try{
    for (int i = 0; i < 10; i++) {
        System.out.println("Child thread");
        Thread.sleep(2000);
    }

}catch(InterruptedException e){
    System.out.println(e.getStackTrace());
}

    }
}
