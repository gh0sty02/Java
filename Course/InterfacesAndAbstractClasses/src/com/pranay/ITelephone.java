package com.pranay;

public interface ITelephone {
    void powerOn();
    void dail(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
