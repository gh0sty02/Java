package com.pranay;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public  Scanner sc = new Scanner(System.in);

    public Phone(String phone){
        this.myNumber = phone;
        this.myContacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public void printContacts(){
        System.out.println("Contact List : \n");
        for (int i = 0; i < myContacts.size(); i++) {

            System.out.println((i + 1) + "." + myContacts.get(i).getName() + " -> " + myContacts.get(i).getNumber());
        }
    }

    public boolean addNewContact(Contact contact){
       if(findContact(contact.getName()) >= 0){

           System.out.println("Contact Already exists on record");
           return false;
       }

       myContacts.add(contact);
//        System.out.println("Contact added : " + contact.getName() + " : " + contact.getNumber());
       return true;

   }

   public boolean removeContact(Contact contact){
       int foundPosition = findContact(contact);
       if(foundPosition < 0){
           System.out.println("Contact :" + contact.getName() + " not found");
           return false;
       }

       System.out.println("Removed Contact : " + contact.getName());
       myContacts.remove(foundPosition);
       return true;
   }

   public String queryContact(Contact contact){
       if(findContact(contact) >= 0){
           return contact.getName();
       }
       return null;
   }

   public Contact queryContact(String name){
        int pos = findContact(name);
        if(pos >= 0){
            return this.myContacts.get(pos);
        }
        return null;
   }



   public boolean updateContact(Contact oldContact, Contact newContact){
       int foundPosition = findContact(oldContact);
       if(foundPosition < 0){
           System.out.println("Contact :" + oldContact.getName() + " not found");
           return false;
       }
       this.myContacts.set(foundPosition, newContact);
       System.out.println("Contact : " + oldContact.getName() + " was replaced by " + newContact.getName());
       return true;
   }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
