package com.adrian.javaGenerics;

import java.util.ArrayList;

public class GenericsPart2 {
    public static void main(String[] args) {
        Team<FootballPlayer> steaua = new Team<>("Steaua");
        Team<FootballPlayer> dinamo = new Team<>("Dinamo");
        Team<BaseballPlayer> yankes = new Team<>("Yankee");
        Player p = new BaseballPlayer("Adrian");
        FootballPlayer d = new FootballPlayer("Hanca");
        FootballPlayer p1 = new FootballPlayer("Ion");
        Player p2 = new SoccerPlayer("Mihai");
        Player p3 = null;
        // boolean added = steaua.addPlayerToTheTeam(p);
        steaua.addPlayerToTheTeam(p1);
        dinamo.addPlayerToTheTeam(d);
        //   steaua.addPlayerToTheTeam(p2);
        //  steaua.addPlayerToTheTeam(p2);
        //  steaua.addPlayerToTheTeam(p3);
        //  steaua.showTeamPlayers();
//        if (added) {
//            System.out.println("The player was added");
//        } else {
//            System.out.println("There was an error");
//        }
        System.out.println(steaua.getNumberOfPlayers());
        System.out.println(dinamo.getNumberOfPlayers());
        //Team<String>brokenTeam=new Team<>("borken");
        //brokenTeam.addPlayerToTheTeam("no-one");

        // try{
        steaua.matchResult(dinamo, 3, 0);
        //   steaua.matchResult(yankes,3,3);

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        steaua.teamScores();
        dinamo.teamScores();
        steaua.showTeamPlayers();

        System.out.println("Rankings");
        System.out.println(steaua.getTeamName() + " " + steaua.ranking() + " points");
        System.out.println(dinamo.getTeamName() + " " + dinamo.ranking() + " points");

        ArrayList<Team<FootballPlayer>> championship = new ArrayList<>();
        championship.add(dinamo);
        championship.add(steaua);
//        championship.sort(new Comparator<Team<FootballPlayer>>() {
//            @Override
//            public int compare(Team o1, Team o2) {
//                return Integer.compare(o2.ranking(), o1.ranking());
//            }
//        });

//        Collections.sort(championship);
//
//        for (Team<FootballPlayer> t : championship
//        ) {
//            System.out.println(t.getTeamName());
//        }

        League<Team<FootballPlayer>>liga1=new League<>("Liga1");
        liga1.addTeam(dinamo);
        liga1.addTeam(steaua);
        liga1.showLeagueTable();

    }
}
