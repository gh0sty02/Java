package com.pranay;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double money){
        if(findCustomer(name) == null){
            Customer newCustomer = new Customer(name, money);
            this.customers.add(newCustomer);
            return true;
        }
        System.out.println("Customer with that name already exists !!");
        return false;
    }

    public boolean addTransaction(String name, double amount){
        Customer exisitingCustomer = findCustomer(name);
        if(exisitingCustomer != null){
            exisitingCustomer.addTransaction(amount);
            return true;
        }
        System.out.println("Cannot find Customer with that name..");
        return false;
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
