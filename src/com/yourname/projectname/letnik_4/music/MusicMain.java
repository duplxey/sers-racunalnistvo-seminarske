package com.yourname.projectname.letnik_4.music;

public class MusicMain {

    public static void main(String[] args) {
        ArtistManager artistManager = new ArtistManager();
        TrackManager trackManager = new TrackManager(artistManager);
        MusicPlayer musicPlayer = new MusicPlayer(trackManager);
        musicPlayer.start();
    }
}
