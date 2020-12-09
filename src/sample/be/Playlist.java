package sample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Playlist
{

    private String title;
    private int id;
    private StringProperty titleProperty;
    private ObservableList<Song> songs;

    public Playlist(String title, int id)
    {
        this.title = title;
        this.id = id;
        songs = FXCollections.observableArrayList();
        titleProperty = new SimpleStringProperty(title);
    }

    /**
     * gets the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * gets the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }


    /**
     * gets the title
     *
     * @return titleproperty
     */
    public StringProperty getTitleProperty() {
        return titleProperty;
    }

    /**
     * gets the song list
     *
     * @return the song list
     */
    public ObservableList<Song> getSongs() {
        return songs;
    }

    /**
     * sets the value of title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
        titleProperty.setValue(title);
    }

    /**
     * Adds a song to playlist
     *
     * @param song
     */
    public void addToPlaylist(Song song) {
        songs.add(song);
    }

    /**
     * Removes a song from a playlist
     *
     * @param song
     */
    public void removeFromPlaylist(Song song) {
        songs.remove(song);
    }

}
