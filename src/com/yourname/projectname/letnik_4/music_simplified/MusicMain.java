package com.yourname.projectname.letnik_4.music_simplified;

public class MusicMain {

    public static void main(String[] args) {
        TrackManager trackManager = new TrackManager();
        MusicPlayer musicPlayer = new MusicPlayer(trackManager);
        musicPlayer.start();
    }
}
