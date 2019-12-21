package com.yourname.projectname.letnik_4.music;

import java.io.*;

public class Track {

    private String name;
    private Artist artist;
    private int duration;

    public Track(String name, Artist artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public Track(ArtistManager artistManager, File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int index = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (index == 0) {
                    name = line;
                } else if (index == 1) {
                    artist = artistManager.getArtist(line);
                } else if (index == 2) {
                    duration = Integer.parseInt(line);
                }
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(TrackManager trackManager) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(trackManager.getTrackDirectory(), name + ".txt")))) {
            bufferedWriter.write(name);
            bufferedWriter.newLine();
            bufferedWriter.write(artist.getId());
            bufferedWriter.newLine();
            bufferedWriter.write(duration + "");
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return name.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return artist.getName() + " - " + name + " [" + duration + "]";
    }
}
