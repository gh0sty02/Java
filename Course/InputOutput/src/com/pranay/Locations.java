package com.pranay;

import java.io.*;
import java.util.*;


public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        try(BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
            BufferedWriter DirFile = new BufferedWriter(new FileWriter("directions.txt"));
        ) {

            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
                for(String direction : location.getExits().keySet()){
                    if(!direction.equalsIgnoreCase("Q")){
                        DirFile.write(location.getLocationID() + "," + direction +"," + location.getExits().get(direction) +
                                "\n");
                    }

                }
            }
        }
    }

    static {


        try( Scanner sc = new Scanner(new BufferedReader(new FileReader("locations.txt")));){
            sc.useDelimiter(",");
            while(sc.hasNextLine()){
                int loc = sc.nextInt();
                sc.skip(sc.delimiter());
                String description = sc.nextLine();
                System.out.println("Imported Loc " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

        }catch (IOException e){
            e.printStackTrace();
        }


        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("directions.txt")));){
            sc.useDelimiter(",");
            while(sc.hasNextLine()){
                // using .split to read each line
                String input = sc.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + " : " + direction + " : " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
