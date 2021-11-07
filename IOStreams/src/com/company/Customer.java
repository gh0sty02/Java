package com.company;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Customer implements Serializable {
    public String customerId = UUID.randomUUID().toString();
    public String name;
    public String phone;

    public Customer( String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
