package com.pranay;

import java.util.*;

public class Theatre {
    public final String theatreName;
    private List<Seat> seats;

    public String getTheatreName() {
        return theatreName;
    }

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.theatreName = name;
        this.seats = new ArrayList<>();

        int lastRow = 'A' + numRows - 1;
        for (char row = 'A'; row <= lastRow ; row++){
            for (int seatNum = 1; seatNum <= seatsPerRow ; seatNum++) {
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9) ){
                    price = 14;
                }else if((row > 'F') || (seatNum < 4 || seatNum > 9)){
                    price = 7;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public boolean reservedSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            this.seats.get(foundSeat).reserved();
            return true;
        }else{
            System.out.println("There is no seat with seatNumber : " + seatNumber);
            return  false;
        }


    }

    public List<Seat> getSeats(){
        return seats;
    }

    static final Comparator<Seat> comparePrices = new Comparator<Seat>() {
        @Override
        public int compare(Seat s1, Seat s2) {
            if(s1.price > s2.getPrice()){
                return 1;
            }else if(s1.price < s2.getPrice()){
                return -1;
            }else {
                return 0;
            }
        }
    };

    public class Seat {
        private final String seatNumber;
        private boolean isReserved = false;
        private double price;


        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

//        @Override
//        public int compareTo(Seat seat) {
////            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
//            if(this.price > seat.getPrice()){
//                return 1;
//            }else if(this.price < seat.getPrice()){
//                return -1;
//            }else {
//                return 0;
//            }
//        }

        public boolean reserved(){
            if(!isReserved){
                this.isReserved = true;
                System.out.println("SeatNumber " + this.seatNumber + " reserved");
                return true;
            }
            else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.isReserved){
                this.isReserved = false;
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}

