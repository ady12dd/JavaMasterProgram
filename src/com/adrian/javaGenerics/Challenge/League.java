package com.adrian.javaGenerics.Challenge;

import java.util.ArrayList;

public class League<T extends Team> {
    private String nameOfTheLeague;
    private ArrayList<T> teams;

    public League(String nameOfTheLeague) {
        this.nameOfTheLeague = nameOfTheLeague;
        this.teams = new ArrayList<T>();
    }

    public String getNameOfTheLeague() {
        return nameOfTheLeague;
    }

    public boolean addTeam(T team){
        if(team!=null && !(this.teams.contains(team))){
            this.teams.add(team);
            return true;
        }else{
            System.out.println("Team already in the list or is null");
            return false;
        }
    }

}
