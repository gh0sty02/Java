package com.pranay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceChallenge {

    public static void main(String[] args) {
	// write your code here

        Player pranay = new Player("Pranay", 100, 50);
        System.out.println(pranay);

        pranay.setHitPoints(23);
        System.out.println(pranay);
        pranay.setWeapon("Gun");
        saveObject(pranay);
        loadObject(pranay);
        System.out.println(pranay);

        ISaveable werewolf;
        werewolf = new Monster("Warewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);


    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving Object - " + objectToSave.write().get(i) + " to storage");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
