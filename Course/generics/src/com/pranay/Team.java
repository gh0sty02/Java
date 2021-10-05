package com.pranay;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int won = 0;;
    private int lost = 0;
    private int tied = 0;
    private int played;

    private ArrayList<T> players = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public boolean addPlayer(T player){
        if(players.contains(player)){
            System.out.println(player.getName() + " already exists in the team");
            return false;
        }
        players.add(player);
        System.out.println(player.getName() + " was selected for the team " + this.getName());
        return true;
    }

    public int numPlayers(){
        return this.players.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message ;
        if(ourScore > theirScore){
            won++;
            message = " won against ";
        }else if(ourScore == theirScore){
            tied++;
            message = " drew against ";


        }else{
            lost++;
            message = " lost against ";

        }

        played++;
        if(opponent!= null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (this.won * 2) + tied;
    }
}
