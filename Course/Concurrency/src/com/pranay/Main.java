package com.pranay;

import static com.pranay.ThreadColors.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main thread");
    }
}
