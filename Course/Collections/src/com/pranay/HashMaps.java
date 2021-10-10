package com.pranay;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<>();
        cities.put("Mumbai", "Financial Capital of India");
        cities.put("Delhi", "Official Capital of India");
        cities.put("Hyderabad", "City famous for it's Biriyani");
        cities.put("Bangalore", "Silicon Valley of India");
        cities.put("Pune", "Home of Education");

        System.out.println(cities.replace("Mumbai","Financial Capital of India" , "Fucking hell"));
//        if(cities.containsKey("Mumbai")){
//            System.out.println("Cities already contains Mumbai");
//        }

        for (String key : cities.keySet()){
            System.out.println(key + " : " + cities.get(key));
        }

    }
}
