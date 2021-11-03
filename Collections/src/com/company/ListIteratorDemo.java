package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Hello");
        l.add("My");
        l.add("name");
        l.add("is");
        l.add("Pranay");

        System.out.println(l);
        ListIterator<String> li = l.listIterator();
        while(li.hasNext()){
            String str = (String)li.next();
            if(str.equals("Pranay")){
                li.set("ghosty");
            }else if(str.equals("is")){
                li.set("will be");
            }else if(str.equals("Hello")){
                li.remove();
            }else if(str.equals("My")){
                li.add("Hello again");
            }

            System.out.println(l);
        }
        System.out.println(li.getClass().getName());

    }
}
