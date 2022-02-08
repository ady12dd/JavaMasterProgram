package JavaGenerics.Challenge;

public class FootballTeam extends Team{
    public FootballTeam(String teamName) {
        super(teamName);
    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }
}
