package ArraysAndLists.LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> listOfSongs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.listOfSongs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (listOfSongs.isEmpty()) {
            System.out.println("The are no songs");
        } else {
            for (Song listOfSong : listOfSongs) {
                stringBuilder.append(" ");
                stringBuilder.append(listOfSong);
            }
        }

        return this.name + " " + this.artist + stringBuilder;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.listOfSongs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song listOfSong : listOfSongs) {
            if (listOfSong.getTitle().compareTo(title) == 0) {
                return listOfSong;
            }
        }
        return null;

    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.listOfSongs.size())) {
            playList.add(this.listOfSongs.get(index));
            return true;
        }
        System.out.println("This album does not have a truck " + trackNumber);
        return false;
    }

    public boolean addToPlayListMyVersion(String title, LinkedList<Song> playList) {

        for (Song song : listOfSongs
        ) {
            if (song.getTitle().compareTo(title) == 0) {
                playList.add(song);
                return true;
            }
        }
        System.out.println("There is no song with that name on the album");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkSong = findSong(title);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        } else {
            System.out.println("There is no song with that name on the album");
            return false;
        }
    }

}
