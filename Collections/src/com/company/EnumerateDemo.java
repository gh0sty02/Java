package com.company;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerateDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i <= 10; i++) {
            v.add(i);
        }

        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()){

            Integer j = (Integer)e.nextElement();
            if(j%2 == 0){
                System.out.println(j);
            }
        }
    }
}
