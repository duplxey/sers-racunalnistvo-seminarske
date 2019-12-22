package com.yourname.projectname.letnik_4.music_simplified;

import java.util.Scanner;

public class MusicPlayer {

    private TrackManager trackManager;

    private Track currentlyPlaying = null;

    public MusicPlayer(TrackManager trackManager) {
        this.trackManager = trackManager;

        System.out.println("------------- UltimateMusicPlayer 3000 -------------");
        System.out.println("To play a song use: /play <song_name>");
        System.out.println("To pause the player use: /pause");
        System.out.println("To resume the player use: /resume");
        System.out.println("----------------------------------------------------");
        System.out.println("Your downloaded songs:");
        for (Track track : trackManager.getTracks().values()) {
            System.out.println("- " + track);
        }
        System.out.println("----------------------------------------------------");
    }

    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine().toLowerCase();
            String[] split = line.split(" ");

            if (split[0].equalsIgnoreCase("current")) {
                if (currentlyPlaying == null) {
                    System.out.println("There's currently nothing playing.");
                }
                System.out.println("Currently playing " + currentlyPlaying);
                continue;
            }

            if (split[0].equalsIgnoreCase("play")) {
                if (split.length == 1) {
                    System.out.println("Wrong syntax! play <song_name>");
                    continue;
                }
                Track track = trackManager.getTrack(split[1]);
                if (track == null) {
                    System.out.println("Unknown track. Are you sure you've entered the right name? If track contains spaced use '-'.");
                    continue;
                }
                play(track);
                continue;
            }

            if (split[0].equalsIgnoreCase("pause")) {
                pause();
                continue;
            }

            if (split[0].equalsIgnoreCase("resume")) {
                resume();
                continue;
            }
        }
    }

    public void play(Track track) {
        System.out.println("Now playing " + track + ".");
        currentlyPlaying = track;
    }

    public void pause() {
        if (currentlyPlaying == null) {
            System.out.println("There's currently nothing playing, cannot pause.");
            return;
        }
        System.out.println("Paused " + currentlyPlaying + ".");
    }

    public void resume() {
        if (currentlyPlaying == null) {
            System.out.println("There's currently nothing playing, cannot resume.");
            return;
        }
        System.out.println("Resumed playing " + currentlyPlaying + ".");
    }

    public Track getCurrentlyPlaying() {
        return currentlyPlaying;
    }
}
