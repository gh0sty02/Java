package com.pranay;

import static com.pranay.ThreadColors.ANSI_PURPLE;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Hello from Runnable Thread");
    }
}
