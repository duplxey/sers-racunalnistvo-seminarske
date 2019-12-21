package com.yourname.projectname.letnik_4.music;

import java.io.File;
import java.util.HashMap;

public class TrackManager {

    private File trackDirectory;
    private HashMap<String, Track> tracks = new HashMap<>();

    public TrackManager(ArtistManager artistManager) {
        trackDirectory = new File("tracks");
        if (!trackDirectory.exists()) trackDirectory.mkdir();

        for (File file : trackDirectory.listFiles()) {
            Track track = new Track(artistManager, file);
            tracks.put(track.getId(), track);
        }

        // If there are no track files yet.
        if (!tracks.containsKey("baby") && !tracks.containsKey("fireworks") && !tracks.containsKey("bad-thoughts")) {
            Track babyTrack = new Track("Baby", artistManager.getArtist("justin-bieber"), 224);
            Track fireworks = new Track("Fireworks", artistManager.getArtist("katy-perry"), 322);
            Track badThoughts = new Track("Bad-thoughts", artistManager.getArtist("dj-khaled"), 123);

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
