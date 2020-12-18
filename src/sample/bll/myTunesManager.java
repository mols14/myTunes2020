package sample.bll;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.be.Playlist;
import sample.be.Song;
import sample.bll.util.FilterSearch;
import sample.dal.PlayListDAO;
import sample.dal.SongDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Filter;

public class MyTunesManager {
    private SongDAO songDAO;
    private PlayListDAO playListDAO;
    private FilterSearch filterSearch;

    public MyTunesManager() throws IOException {
        songDAO = new SongDAO();
        playListDAO = new PlayListDAO();
        filterSearch = new FilterSearch();
    }

    public Song createSong(String title, String artist, int duration, String url) throws SQLException {
        return songDAO.createSong(title, artist, duration, url);
    }

    public Playlist createPlaylist(String title) throws SQLException {
        return playListDAO.createPlaylist(title);
    }

    public List<Song> getAllSongs() throws IOException {
        return songDAO.getAllSongs();
    }

    public ObservableList<Song> filter(ObservableList<Song> filterBase, String query) {
        ObservableList<Song> foundSongs= FXCollections.observableArrayList();
        foundSongs.addAll(filterSearch.filter(filterBase, query));
        return foundSongs;
    }
}