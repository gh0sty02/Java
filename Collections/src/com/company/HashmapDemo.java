package com.company;

import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
        h.put("Pranay", 100);
        h.put("Aniket", 200);
        h.put("Omkar", 300);
        h.put("Hauri", 400);


        Set<String> keys = h.keySet();
        Collection<Integer> values = h.values();
        Set<Map.Entry<String, Integer>> entries = h.entrySet();

//        Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
//        while ((itr.hasNext())){
//            Map.Entry<String, Integer> m1 = itr.next();
//            if(m1.getKey().equals("Pranay")){
//                m1.setValue(400000);
//            }
//
//        }

        System.out.println(h);


    }
}
