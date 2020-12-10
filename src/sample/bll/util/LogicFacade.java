package sample.bll.util;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;



public class LogicFacade {

    private MediaPlayer mediaPlayer;

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void playSong() {
        File file = new File("C:/Users/Svend Halding/Desktop/New folder/songs/Black.mp3");
        String filePath = file.toURI().toString();
        Media media = new Media(filePath);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
