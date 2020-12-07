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

    public StringProperty getTitleProperty() {
        return titleProperty;
    }

    public ObservableList<Song> getSongs() {
        return songs;
    }

    public void setTitle(String title) {
        this.title = title;
        titleProperty.setValue(title);
    }
}
