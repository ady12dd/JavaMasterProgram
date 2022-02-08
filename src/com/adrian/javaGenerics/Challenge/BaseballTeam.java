package com.adrian.javaGenerics.Challenge;

public class BaseballTeam extends Team {
    public BaseballTeam(String teamName) {
        super(teamName);
    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }
}
