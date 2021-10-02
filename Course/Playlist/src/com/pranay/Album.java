package com.pranay;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String name, String duration){
        if(searchSong(name) == null){
            Song newSong = new Song(name, duration);
            this.songs.add(newSong);
            return true;
        }
        System.out.println("Song already exists !!.");
        return false;
    }

    private Song searchSong(String name){
        for (int i = 0; i < this.songs.size(); i++) {
            Song currentSong = this.songs.get(i);
            if(currentSong.getTitle().equals(name)){
                return currentSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int tracknumber, LinkedList<Song> playlist){
        int index = tracknumber - 1;
        if((index >= 0) && (index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }

        System.out.println("The album does not have this track : " + tracknumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song foundSong = searchSong(title);
        if(foundSong != null){
            playlist.add(foundSong);
            return true;
        }
        System.out.println("The album does not have this track : " + title);
        return false;
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
