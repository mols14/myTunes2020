package sample.bll;

import sample.be.Song;
import sample.dal.SongDAO;

import java.io.IOException;
import java.sql.SQLException;

public class MyTunesManager {
    private SongDAO songDAO;

    public MyTunesManager() throws IOException {
        songDAO = new SongDAO();
    }

    public Song createSong(String title, String artist, float duration, String url) throws SQLException {
        return songDAO.createSong(title, artist, duration, url);
    }
}