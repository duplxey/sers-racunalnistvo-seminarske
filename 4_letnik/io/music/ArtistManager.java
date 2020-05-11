package com.yourname.projectname.letnik_4.music;

import java.util.HashMap;

public class ArtistManager {

    private HashMap<String, Artist> artists = new HashMap<>();

    public ArtistManager() {
        artists.put("justin-bieber", new Artist("justin-bieber", "Justin Bieber", "Justin Drew Bieber is a Canadian singer, songwriter and actor."));
        artists.put("katy-perry", new Artist("katy-perry", "Katy Perry", "Katheryn Elizabeth Hudson known professionally as Katy Perry, is an American singer, songwriter and television personality."));
        artists.put("dj-khaled", new Artist("dj-khaled", "DJ Khaled", "Khaled Mohamed Khaled better known as DJ Khaled, is an American DJ, record executive, songwriter, record producer and media personality."));
    }

    public Artist getArtist(String name) {
        return artists.get(name);
    }

    public HashMap<String, Artist> getArtists() {
        return artists;
    }
}
