package sample.bll.util;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;




public class LogicFacade {

    private MediaPlayer mediaPlayer;

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void playSong() {
        String filePath = "C:/Users/Svend Halding/Desktop/New folder/songs/Black.mp3";
        Media media = new Media(filePath);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
