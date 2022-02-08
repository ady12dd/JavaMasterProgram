package com.adrian.javaGenerics.Challenge;

import java.util.ArrayList;

public abstract class Team implements Comparable<Team>{
    private final String teamName;
    private final ArrayList<Object> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayers(Object a) {
        this.players.add(a);
        return true;
    }
}
