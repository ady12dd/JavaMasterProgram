package ArraysAndLists.LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicProgram {

    private static ArrayList<Album> listOfAlbums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer2", 4.22);
        album.addSong("Stormbringer3", 4.63);
        album.addSong("Stormbringer4", 4.64);
        album.addSong("Stormbringer5", 4.5);
        album.addSong("Stormbringer6", 4.1);
        album.addSong("Stormbringer7", 4.4);
        album.addSong("Stormbringer8", 4.9);
        album.addSong("Stormbringer9", 5.0);

        Album album1 = new Album("For those about to work", "AC/DC");
        album1.addSong("For those about to rock", 5.44);
        album1.addSong("For those about to rock2", 5.34);
        album1.addSong("For those about to rock3", 5.14);
        album1.addSong("For those about to rock4", 5.24);
        album1.addSong("For those about to rock5", 5.76);
        album1.addSong("For those about to rock6", 6.44);
        album1.addSong("For those about to rock7", 12.44);
        album1.addSong("For those about to rock8", 3.44);
        album1.addSong("For those about to rock9", 1.44);

        listOfAlbums.add(album);
        listOfAlbums.add(album1);

        LinkedList<Song> playList = new LinkedList<>();
        addSongToPlayList("Stormbringer4", listOfAlbums.get(1), playList);
        addSongToPlayList("Stormbringer4", listOfAlbums.get(0), playList);
        addSongToPlayList("Stormbringer3", listOfAlbums.get(0), playList);
        addSongToPlayList("Stormbringer2", listOfAlbums.get(0), playList);
        addSongToPlayList("Stormbringer", listOfAlbums.get(0), playList);
        addSongToPlayList("For those about to rock3", listOfAlbums.get(1), playList);
        System.out.println("The playerSong is ON**********************");
        System.out.println();
        System.out.println();

        play(playList);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No song in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString() + " minutes");
        }
        boolean quit = false;
        boolean forward = true;
        printMenu();
        while (!quit) {

            System.out.println("Plase choose an option");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    System.out.println("Playlist was stopped");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("You have reached the end of the list");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You have reached the start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing from the start " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing from the start " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous());
                        }else{
                            System.out.println("The list is empty");
                        }

                    }else{
                        System.out.println("The list is empty");
                    }
                    break;
                default:
                    System.out.println("Plase choose an option from the menu");
            }


        }
    }

    private static void replayCurrentSong() {
        System.out.println("Now playing ");
    }

    private static void printList(LinkedList<Song> playList) {
        int index = 0;
        for (Song song : playList
        ) {
            index++;
            System.out.println(index + ". " + song.toString());
        }
    }

    private static void printMenu() {
        System.out.println("Menu");
        System.out.println("0-Exit\n" +
                "1-play next song \n" +
                "2-play previous song\n" +
                "3-replay the current song\n" +
                "4-list the songs in the playlist\n" +
                "5-print menu\n" +
                "6-delete the song");
    }

    public static void addSongToPlayList(String title, Album album, LinkedList<Song> playList) {
        int index = listOfAlbums.indexOf(album);
        if (listOfAlbums.get(index).addToPlayListMyVersion(title, playList)) {
            System.out.println("The song was with the name " + title + " was added");
        } else {
            System.out.println("The song has not been added");
        }
    }
}
