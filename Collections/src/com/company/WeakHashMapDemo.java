package com.company;

import java.util.*;

public class WeakHashMapDemo  {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<temp, String> h = new WeakHashMap<>();
        temp t = new temp();
        h.put(t, "HEllo");
        System.out.println(h);
        t = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(h);
    }

}
class temp{
    @Override
    public String toString() {
        return "temp";
    }


    public void finalize()  {
        System.out.println("finalize Called");
    }
}
