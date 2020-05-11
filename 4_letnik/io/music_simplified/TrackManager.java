package com.yourname.projectname.letnik_4.music_simplified;

import java.io.File;
import java.util.HashMap;

public class TrackManager {

    private File trackDirectory;
    private HashMap<String, Track> tracks = new HashMap<>();

    public TrackManager() {
        // Create the directory
        trackDirectory = new File("tracks");
        if (!trackDirectory.exists()) trackDirectory.mkdir();

        // Loop through and load the tracks
        for (File file : trackDirectory.listFiles()) {
            Track track = new Track(file);
            tracks.put(track.getId(), track);
        }

        // If there are no track files yet, register some.
        if (!tracks.containsKey("baby") && !tracks.containsKey("fireworks") && !tracks.containsKey("bad-thoughts")) {
            Track babyTrack = new Track("Baby", "Justin Bieber", 224);
            Track fireworks = new Track("Fireworks", "Katy Perry", 322);
            Track badThoughts = new Track("Bad-thoughts", "DJ Khaled", 123);

            tracks.put(babyTrack.getId(), babyTrack);
            tracks.put(fireworks.getId(), fireworks);
            tracks.put(badThoughts.getId(), badThoughts);

            babyTrack.save(this);
            fireworks.save(this);
            badThoughts.save(this);
        }
    }

    public Track getTrack(String id) {
        return tracks.get(id);
    }

    public HashMap<String, Track> getTracks() {
        return tracks;
    }

    public File getTrackDirectory() {
        return trackDirectory;
    }
}
