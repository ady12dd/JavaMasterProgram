package JavaGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{
    private final String leagueName;
    private final ArrayList<T> league;

    public String getLeagueName() {
        return leagueName;
    }

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.league = new ArrayList<>();
    }

    public boolean addTeam(T team){
        if(team!=null && !(this.league.contains(team))){
            this.league.add(team);
            return true;
        }else{
            System.out.println("Team is null or already in the league");
            return false;
        }
    }

    public void sortList(){
        Collections.sort(this.league);
    }

    public void showLeagueTable(){
        sortList();
        System.out.println(this.leagueName);
        for (T team:league
             ) {
            System.out.println(team.getTeamName());
        }
    }
}
