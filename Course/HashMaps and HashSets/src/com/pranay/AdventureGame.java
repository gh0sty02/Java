package com.pranay;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class AdventureGame {

    public static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
	// write your code here
         Scanner in = new Scanner(System.in);

        locations.put(0,new Location(0, "You are sitting in front of your computer and learning java"));
        locations.put(1, new Location(1, "You are at the End of the road"));
        locations.put(2, new Location(2, "You are at the top of the hill"));
        locations.put(3, new Location(3, "You are inside a building, a small penthouse"));
        locations.put(4, new Location( 4, "You are sitting near a river in a valley"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExits("W", 2);
        locations.get(1).addExits("E", 3);
        locations.get(1).addExits("N", 5);
        locations.get(1).addExits("S", 4);

        locations.get(2).addExits("N", 5);

        locations.get(3).addExits("W", 1);

        locations.get(4).addExits("N", 1);
        locations.get(4).addExits("W", 2);

        locations.get(5).addExits("S", 1);
        locations.get(5).addExits("W", 2);







        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            Map<String, String> availableExits = new HashMap<>();
            availableExits.put("NORTH", "N");
            availableExits.put("SOUTH", "S");
            availableExits.put("WEST", "W");
            availableExits.put("EAST", "E");
            availableExits.put("QUIT", "Q");


            System.out.print("Available Exits are : ");
            for(String key : exits.keySet()){
                System.out.print(key + ",");
            }
            System.out.println();

            System.out.print("Enter Direction : ");
            String direction = in.nextLine().toUpperCase();
//            String direction = null;
            if(direction.length() > 1){
                String[] inputArray = direction.split(" ");
                for(String inp : inputArray){
                    if(availableExits.containsKey(inp)){
                        direction = availableExits.get(inp);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("You cannot go there !.");
            }
        }
    }
}
