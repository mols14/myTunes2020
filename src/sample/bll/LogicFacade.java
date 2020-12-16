package sample.bll;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;

import java.io.File;



public class LogicFacade {

    private MediaPlayer mediaPlayer;

    private boolean isPlaying = false;
    private String addSongPath;

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
    public void playSong() {
        if(!isPlaying && this.mediaPlayer != null){
            mediaPlayer.play();
            isPlaying = true;
        }
        else if (!isPlaying) {
            File file = new File("music/Resonance.mp3");
            String filePath = file.toURI().toString();
            Media media = new Media(filePath);
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            isPlaying = true;
        }
        else if(isPlaying){
            mediaPlayer.pause();
            isPlaying = false;
        }

    }

    public void chooseSongToAdd() {
        String filepath;
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        filepath = file.toURI().toString();
        System.out.println(filepath);
    }
}
