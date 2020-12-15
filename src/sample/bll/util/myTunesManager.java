package sample.bll.util;

import sample.be.Song;
import sample.dal.file.SongDAO;

import java.sql.SQLException;

public class myTunesManager {
    private SongDAO songDAO;

    public myTunesManager() {
        songDAO = new SongDAO();
    }

    public Song createSong(String title, String artist, float duration, String url) throws SQLException {
        return songDAO.createSong(title, artist, duration, url);
    }
}