package com.pranay;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("PVR", 8, 12);

        Collections.sort(theatre.getSeats(), Theatre.comparePrices);
//        theatre.getSeats();

//        if(theatre.reservedSeat("H11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Seat Already Booked");
//        }
        printList(theatre.getSeats());


//        if(theatre.reservedSeat("H11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Seat Already Booked");
//        }
    }

    static void printList(List<Theatre.Seat> seats){
        for(Theatre.Seat seat : seats){
            System.out.print(seat.getSeatNumber() + " " + seat.getPrice() + "  ");
        }
    }
}
