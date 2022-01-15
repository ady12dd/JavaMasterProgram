package ArraysAndLists.LinkedList.Challenge;

public class Song {
    private String title;
    private double durationOfASong;

    public Song(String title, double durationOfASong) {
        this.title = title;
        this.durationOfASong = durationOfASong;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationOfASong() {
        return durationOfASong;
    }

    public void setDurationOfASong(double durationOfASong) {
        this.durationOfASong = durationOfASong;
    }

    @Override
    public String toString() {
        return this.getTitle()+" "+this.durationOfASong;
    }
}
