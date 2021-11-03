package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
//        System.out.println(Thread.currentThread().getPriority());

        MyThread t = new MyThread();

        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }

    }
}
