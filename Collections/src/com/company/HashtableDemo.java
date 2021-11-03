package com.company;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<temp1, String> h = new Hashtable<>();
        h.put(new temp1(1), "A");
        h.put(new temp1(5), "B"    );
        h.put(new temp1(6), "C");
        h.put(new temp1(15), "D");
        h.put(new temp1(45), "E");
        h.put(new temp1(16), "F");

        System.out.println(h);
    }
}

class temp1{
    public int i;

    public temp1(int i){
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i % 9;
    }

    @Override
    public String toString() {
        return i + " ";
    }
}
