package com.pranay;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String contactName, String contactNumber) {
        this.name = contactName;
        this.phoneNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phoneNumber;
    }

    public static Contact addContact(String name, String number){
        return new Contact(name, number);
    }
}
