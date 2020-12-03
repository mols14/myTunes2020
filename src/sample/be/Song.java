package sample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Song {

    private StringProperty title;
    private StringProperty artist;
    private final int id;
    private final float time;

    public Song(String title, String artist, int id, float time) {
        this.title = new SimpleStringProperty(title);
        this.artist = new SimpleStringProperty(artist);
        this.id = id;
        this.time = time;
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getArtist() {
        return artist.get();
    }

    public void setArtist(String artist) {
        this.artist.set(artist);
    }

    public int getId() {
        return id;
    }

    public float getTime() {
        return time;
    }
}
