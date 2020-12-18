package sample.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.bll.MyTunesManager;
import sample.gui.model.SongModel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class NewSongController implements Initializable {

    private MediaPlayer mediaPlayer;
    private SongModel songModel;

    @FXML
    private SplitMenuButton categoryFolder;
    @FXML
    private TextField songFilePathInput;
    @FXML
    private TextField timeSongInput;
    @FXML
    private TextField artistSongInput;
    @FXML
    private TextField titleSongInput;
    @FXML
    private Button categoryMoreButton;
    @FXML
    private Button fileSongPathChooseButton;
    @FXML
    private Button newSongCancel;
    @FXML
    private Button saveSong;

    public NewSongController() throws IOException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            songModel = new SongModel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickedMoreCategoryBN(){
        System.out.println("MoreCategoryBN is working");
        //TODO
    }

    public void clickedNewSongCancel(ActionEvent event) throws IOException {
        Parent Playlist = FXMLLoader.load(getClass().getResource("/sample/gui/view/myTunes.fxml"));
        Scene NewPlaylist = new Scene(Playlist); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindowStage.setScene(NewPlaylist); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }

    public void clickedSaveSong(ActionEvent actionEvent) throws IOException, SQLException {
       songModel.createSong(titleSongInput.getText(),artistSongInput.getText(), Integer.parseInt(timeSongInput.getText()),songFilePathInput.getText());
        clickedNewSongCancel(actionEvent);
    }

    public void handleChooseFile(ActionEvent actionEvent) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory(new File("music/" )); //Sets the directory to the desktop
            fileChooser.setTitle("Select song");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Audio Files",  "*.mp3"));
            File selectedFile = fileChooser.showOpenDialog(null);
            if (selectedFile != null) {
                songFilePathInput.setText(selectedFile.getName());
                mediaPlayer = new MediaPlayer(new Media(new File(selectedFile.getAbsolutePath()).toURI().toString())); // Sets up the media object in order to get time of the song
                //setMediaPlayerTime(); // Gets time of the song
            }
        }
}
