package com.pranay;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");
        FootballPlayer messi = new FootballPlayer("Messi");
        FootballPlayer suarez = new FootballPlayer("Suarez");
        FootballPlayer ramos = new FootballPlayer("Ramos");
        BaseballPlayer james = new BaseballPlayer("James");
        SoccerPlayer idk = new SoccerPlayer("IDk");

        Team<FootballPlayer> barcelona = new Team<FootballPlayer>("Barcelona");
        barcelona.addPlayer(messi);
        barcelona.addPlayer(suarez);

        Team<FootballPlayer> realMadrid = new Team<FootballPlayer>("realMadrid");
        realMadrid.addPlayer(ramos);
        realMadrid.addPlayer(ronaldo);

        Team<BaseballPlayer> lakers = new Team<BaseballPlayer>("Lakers");

        barcelona.matchResult(realMadrid, 5, 0);
        realMadrid.matchResult(barcelona, 0 , 7);
//        barcelona.matchResult(lakers, 3, 0);

        System.out.println("Rankings..");
        System.out.println(barcelona.getName() + " : " + barcelona.ranking());
        System.out.println(realMadrid.getName() + " : " + realMadrid.ranking());



    }
}
