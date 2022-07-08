package com.mejia.objectfactory.songfactory;

import com.mejia.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
//        private String title;
//        private String artist;
//        private String genre;
//        private int seconds;

        System.out.println("Song Factory\n\n");

        String title = UI.readString("What is the title of the song?");
        String artist = UI.readString("Who sing the song?");
        String genre = UI.readString("What is the genre of the song?");
        int seconds = UI.readInt("How long, in seconds, is the song?", 0, 3600);

        Song generatedSong = new Song(title, artist, genre, seconds);
        System.out.println(generatedSong);

    }
}
