package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private final String teamName;
    private final List<T> teamMembers;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public String getTeamName() {
        return teamName;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamMembers = new ArrayList<>();
    }

    public void addPlayerToTheTeam(T player) {
        if (player != null && !this.teamMembers.contains(player) && (player instanceof FootballPlayer || player instanceof SoccerPlayer)) {
            this.teamMembers.add(player);
        } else if (player == null) {
            System.out.println("This player that you added does not exist.");
        } else if (!(player instanceof FootballPlayer || player instanceof SoccerPlayer)) {
            System.out.println("The player can't play in a football team");
        } else {
            System.out.println("This player that you added or is already in the team.");
        }

    }

    public void showTeamPlayers() {
        int numberOfPlayer = 0;
        for (T p : this.teamMembers
        ) {
            ++numberOfPlayer;
            System.out.println(numberOfPlayer + ". " + p.getName());
        }
    }

    public int getNumberOfPlayers() {
        return this.teamMembers.size();
    }

    public void teamScores() {
        System.out.println("Scores of the team " + this.teamName);
        System.out.println("Played: " + this.played);
        System.out.println("Won: " + this.won);
        System.out.println("Tied: " + this.tied);
        System.out.println("Lost: " + this.lost);
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {


        if (ourScore > theirScore) {
            this.played++;
            this.won++;

        } else {
            if (ourScore == theirScore) {
                this.played++;
                this.tied++;
            } else {
                this.played++;
                this.lost++;
            }
        }
        if (opponent != null) {
            opponent.matchResult(null,
                    theirScore,
                    ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return -1;
        }else if(this.ranking()==team.ranking()){
            return 0;
        }else{
            return 1;
        }
    }
}
