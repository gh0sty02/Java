package com.pranay;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Phone phone = new Phone("9096 0169 46");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while(!quit){
            System.out.println("Enter Action (Press 6 for all actions ) : ");
            int action = in.nextInt();
            in.nextLine();


            switch (action){
                case 0 :
                    System.out.println("\n Shutting Down...");
                    quit = true;
                    break;
                case 1 :
                    phone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;


            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter Contact Name : ");
        String name = in.nextLine();
        System.out.println("Enter Phone : ");
        String phoneNum = in.nextLine();

        Contact newContact = Contact.addContact(name, phoneNum);

        if(phone.addNewContact(newContact)){
            System.out.println("Contact Created : " + newContact.getName() + " " + newContact.getNumber());
        }else{
            System.out.println("Failed, " + newContact.getName() + " already exists on phone !!");
        }
    }
    private static void updateContact(){

        System.out.println("Enter existing contact name : ");
        String name = in.nextLine();
        Contact existingContact =phone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found !");
            return;
        }

        System.out.println("Enter new Contact name : ");
        String newName = in.nextLine();
        System.out.println("Enter new Phone number : ");
        String newPhone = in.nextLine();

        Contact newContact = Contact.addContact(newName, newPhone);

        phone.updateContact(existingContact, newContact);
        if(phone.updateContact(existingContact, newContact)){
            System.out.println("Contact updated successfully !");
        }else{
            System.out.println("Error Updating Record");
        }


    }

    private static void removeContact(){
        System.out.println("Enter existing contact name : ");
        String name = in.nextLine();
        Contact existingContact =phone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found !");
            return;
        }

        phone.removeContact(existingContact);
        if(phone.removeContact(existingContact)){
            System.out.println("Contact Removed Successfully");
        }else{
            System.out.println("Error removing the Contact");
        }
    }

    private static void queryContact(){

        System.out.println("Enter existing contact name : ");
        String name = in.nextLine();
        Contact existingContact =phone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found !");
            return;
        }

        System.out.println("Name : " + existingContact.getName() + " , Phone Number : " + existingContact.getNumber());
    }



    public static void startPhone(){
        System.out.println("Starting Phone...");
    }

    public static void printActions(){
        System.out.println("Available actions : \n press ");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts"+
                "2  - to add a new contact\n" +
                "3  - to update existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - to query if an existing contact exists\n" +
                "6  - to print a list of available actions\n" );
        System.out.println("Choose your action : ");
    }

}
