package com.yourname.projectname.letnik_4.music_simplified;

import java.io.*;

public class Track {

    private String name;
    private String artist;
    private int duration;

    public Track(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public Track(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int index = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (index == 0) {
                    name = line;
                } else if (index == 1) {
                    artist = line;
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
            bufferedWriter.write(artist);
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

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return artist + " - " + name + " [" + duration + "]";
    }
}
