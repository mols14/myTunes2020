package sample.bll;

import sample.be.Playlist;
import sample.be.Song;
import sample.dal.PlayListDAO;
import sample.dal.SongDAO;

import java.io.IOException;
import java.sql.SQLException;

public class MyTunesManager {
    private SongDAO songDAO;
    private PlayListDAO playListDAO;

    public MyTunesManager() throws IOException {
        songDAO = new SongDAO();
        playListDAO = new PlayListDAO();
    }

    public Song createSong(String title, String artist, float duration, String url) throws SQLException {
        return songDAO.createSong(title, artist, duration, url);
    }

    public Playlist createPlaylist(String title) throws SQLException {
        return playListDAO.createPlaylist(title);
    }

}