package sample.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.be.Song;
import sample.bll.LogicFacade;
import sample.bll.MyTunesManager;

import java.io.IOException;
import java.sql.SQLException;

public class SongModel {

    private LogicFacade lF = new LogicFacade();
    private ObservableList<Song> allSongs = FXCollections.observableArrayList();
    private MyTunesManager myTunesManager;

    public SongModel() throws IOException {
        myTunesManager = new MyTunesManager();
    }

    public ObservableList<Song> getSongs() throws IOException {
        allSongs = FXCollections.observableArrayList();
        allSongs.addAll(myTunesManager.getAllSongs());
        return allSongs;
    }

    public void createSong(String title, String artist, float duration, String url) throws SQLException {
        myTunesManager.createSong(title, artist, duration, url);
    }

    public void playSong(){
       lF.playSong();
    }

    public void addSongFromPath() {
        lF.chooseSongToAdd();}
}
