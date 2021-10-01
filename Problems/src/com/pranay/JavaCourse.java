package com.pranay;

public class JavaCourse {
    public static void main(String[] args) {

//        int pos = calculateScore(1500);
//        displayHighScorePosition("Alex", pos);

//        System.out.println(toMilesPerHour(75.114));
//        printConversion(75.114);
//        getDurationString(75, 45);
//        calculate(0, 100);

        int num = 12321;
        System.out.println(getEvenDigitSum(num));
    }

    static int getEvenDigitSum(int n){
        int sum = 0;
        if(n < 0) return -1;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            if(digit % 2 != 0) continue;
            sum += digit;

        }

        return sum;
    }

//    static int sumOfFirstandLast(int n){
//        if(n < 0) return -1;
//        int sum = 0;
//        int firstDigit = n;
//        while(firstDigit >= 10){
//            firstDigit /=10;
//        }
//
//        int lastDigit = n % 10;
//
//
//        return firstDigit + lastDigit;
//
//    }
//
//    static int firstDigit(int n){
//        while(n >= 10){
//            n /=10;
//        }
//        return n;
//    }

//    static boolean isPalindrome(int n){
//
//
//        int rev = 0;
//        int ogNum = n;
//        while((n > 0 ? n : Math.abs(n)) > 0){
//            int digit = n % 10;
//            rev = rev * 10 + digit ;
//            n /= 10;
//        }
//        return ogNum == rev;
//    }

//    static void sumOfDigits(int n){
//        if(n< 10) System.out.println("Invalid Input");
//        int sum = 0;
//        while(n > 0){
//            int digit = n % 10;
//            sum +=digit;
//            n/= 10;
//        }
//
//        System.out.println(sum);
//    }

//    public static void calculate(int start, int end){
//        for (int i = start; i <= end; i++) {
//            if(i % 3 == 0 || i % 5 == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }

//    public static void printNumberInWord(int n){
//        if(n < 0) return;
//        switch (n){
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            default:
//                System.out.println("OTHERS");
//
//        }
//    }

//  static boolean shouldWakeUp(boolean isBarking, int time){
//        if(time > 23 || time < 0) System.out.println("Time Should be Between 0 to 23");
//
//      return (time < 8 && time > 0) || (time >= 22 && time <= 23);
//  }

//    static void getDurationString(int minutes, int seconds){
//        if(minutes <= 0){
//            System.out.println("Invalid Value");
//        }
//        if(seconds <= 0 || seconds >= 59){
//            System.out.println("Invalid Value");
//
//        }
//
//        int hour = minutes / 60;
//        int finalMinutes = minutes % 60;
//
//        System.out.println(hour+"h"+finalMinutes+"m"+seconds+"s");
//    }

//    static double area(double r){
//        if(r < 0) return -1.0;
//        return 2* Math.PI * r * r;
//    }
//
//    static double area(double len, double breadth){
//        if(len < 0 || breadth < 0) return -1.0;
//
//        return len * breadth;
//    }

//    static void printConversion(double kmPerHour){
//        double kmp = 0.621371d;
//        double mph =  Math.round(kmPerHour * kmp);
//
//        System.out.println(kmPerHour + "km/h = "+mph + "mp/h");
//    }
//
//    static double toMilesPerHour(double kmPerHour){
//        if(kmPerHour == 0) return -1;
//        double kmToMiles = 0.621371d;
//
//        return Math.round(kmPerHour * kmToMiles);
//
//    }

//    static void displayHighScorePosition(String player, int pos){
//        System.out.println(player + " managed to get position " + pos);
//    }

//    static int calculateScore(int score){
//        if(score > 1000 ) return 1;
//        if(score < 1000 && score > 500) return 2;
//        if(score < 500 && score > 100) return 3;
//        else return 4;
//    }
}
