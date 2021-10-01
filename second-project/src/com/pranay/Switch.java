package com.pranay;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Id ");
        int empId = in.nextInt();
        System.out.println("Enter Department");
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Employee 1");
                break;
            case 2 :
                System.out.println("Employee 2");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("Employee 3 from IT department");
                    case "AutoMobile" -> System.out.println("Employee 3 from AutoMobile Department");
                }
                break;
            default:
                System.out.println("Enter a Valid Emp Id");
        }
    }
}
