package com.pranay;

public class VipCustomer {
    private String name;
    private String email;
    private int creditLimit;

    VipCustomer(String name, String email, int creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    VipCustomer(){
        this("default name", "default email", 100);
    }

    VipCustomer(String name, String email){
        this(name, email, 100);
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }
}
