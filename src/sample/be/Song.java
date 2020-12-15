package sample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Song {

    private final String url;
    private StringProperty title;
    private StringProperty artist;
    private final int id;
    private final float duration;

    public Song(int id, String title, String artist, float duration, String url) {
        this.title = new SimpleStringProperty(title);
        this.artist = new SimpleStringProperty(artist);
        this.id = id;
        this.duration = duration;
        this.url = url;

    }

    /**
     * gets and set the title of a song
     *
     * @return
     */
    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    /**
     * gets and set the name of the artist of a song
     * @return
     */
    public String getArtist() {
        return artist.get();
    }

    public void setArtist(String artist) {
        this.artist.set(artist);
    }

    /**
     * gets the id of a song
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * gets the duration of a song
     *
     * @return
     */
    public float getDuration() {
        return duration;
    }
}
