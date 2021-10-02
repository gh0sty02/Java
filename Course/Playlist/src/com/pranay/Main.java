package com.pranay;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Album> albums = new ArrayList<>();


        Album album1 = new Album("Meteora", "Linkin Park");
        album1.addSong("In the End", "4.3");
        album1.addSong("Faint", "4.6");
        album1.addSong("Breaking the habit", "3.2");
        album1.addSong("Numb", "4.7");
        album1.addSong("Somewhere I belong", "5.1");
        album1.addSong("Hit the floor", "4.0");
        albums.add(album1);

        Album album2 = new Album("One More Light", "Linkin Park");
        album2.addSong("Talking to Myself", "3.2");
        album2.addSong("Heavy", "4.5");
        album2.addSong("Nobody can save me", "4.1");
        album2.addSong("Invisible", "3.7");
        album2.addSong("One more Light", "3.3");
        album2.addSong("Battle Symphony", "5.3");
        album2.addSong("Sharp Edges", "2.3");

        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("In the End", playlist);
        albums.get(0).addToPlaylist("Numb", playlist);
        albums.get(0).addToPlaylist("Somewhere I belong", playlist);
        albums.get(0).addToPlaylist("Fuck", playlist);


        play(playlist);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in Playlist !!");
        }else{
            System.out.println("Currently Playing - " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();

            switch (action){
                case 0:
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;
                case 1 :
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing - " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached end of the playlist");
                        forward = false;
                    }
                    break;
                case 2 :
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing - " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the Start of the Playlist");
                        forward = true;
                    }
                    break;
                case 3 :
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying - " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying - " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached the end of the list ");
                        }
                    }
                    break;
                case 4 :
                    printList(playlist);
                case 5 :
                    printMenu();

                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing -  " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now plalying - " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static  void printMenu(){
        System.out.println("Available actions :\npress");
        System.out.println("0 - to quit \n" +
                        "1 - to play next song \n"+
                        "2 - to play previous song \n" +
                        "3 - to to reply the current song \n" +
                        "4 - to list the songs in playlist \n" +
                        "5 - print available actions \n"+
                "6 - delete current song from playlist \n"



        );
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }
}
