package com.pranay;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> cities = new LinkedList<>();
        addInOrder(cities, "Mumbai");
        addInOrder(cities,"Delhi");
        addInOrder(cities,"Bangalore");
        addInOrder(cities,"Pune");
        addInOrder(cities,"Hyderabad");
        addInOrder(cities,"Kota");

        printList(cities);
        addInOrder(cities,"Satara");
        printList(cities);


    }

    private static void printList(LinkedList<String> list){
        System.out.println();
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("-------------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

}
