package com.pranay;

import static com.pranay.ThreadColors.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_RED + "Hello from the main thread");

        new Thread(){
            public void run(){
                System.out.println(ANSI_CYAN+"hello from anonymous class");
            }
        }.start();

        Thread anotherThread = new AnotherThread();
        anotherThread.start();


        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        System.out.println(ANSI_BLUE+"hello again");
    }
}
