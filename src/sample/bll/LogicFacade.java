package sample.bll;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;



public class LogicFacade {

    private MediaPlayer mediaPlayer;

    private boolean isPlaying = false;
    private String addSongPath;

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void chooseSongToAdd() {
    }
}
