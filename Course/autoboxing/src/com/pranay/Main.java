package com.pranay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Bank bank = new Bank("Swiss Bank");
     bank.addBranch("Vontobel");
     bank.addBranch("Atlanta");

     bank.addCustomer("Vontobel", "Alex", 67.00);
     bank.addCustomer("Vontobel", "Rudy", 23.00);
     bank.addCustomer("Vontobel", "Andrew", 47.00);
     bank.addCustomer("Atlanta", "Jamal", 68.00);


     bank.addCustomerTransaction("Vontobel", "Alex", 20.00);
     bank.addCustomerTransaction("Vontobel", "Alex", 22.00);
     bank.addCustomerTransaction("Vontobel", "Omkar", 12.00);
     bank.addCustomerTransaction("Atlanta", "Jamal", 12.00);

     bank.listCustomers("Vontobel", true);


    }
}
