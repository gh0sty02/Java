package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }

        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            Integer in = (Integer)( i.next());
            if(in % 2 == 0){
                i.remove();
            }else{
                System.out.println(in);
            }
        }

        System.out.println(l);
    }
}
