package sample.gui.controller;

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

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class newSongController implements Initializable {

    private SongModel sM = new SongModel();

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void clickedFileSOngPathChooseBN(){
        sM.addSongFromPath();
        System.out.println("FileSongPathChooseBN  is working");
        //TODO

        String filepath;
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        filepath = file.toURI().toString();
        System.out.println(filepath);
    }

    public void clickedMoreCategoryBN(){
        System.out.println("MoreCategoryBN is working");
        //TODO
    }

    public void clickedNewSongCancel(javafx.event.ActionEvent event) throws IOException {
        Parent Playlist = FXMLLoader.load(getClass().getResource("/sample/gui/view/myTunes.fxml"));
        Scene NewPlaylist = new Scene(Playlist); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindowStage.setScene(NewPlaylist); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }

    public void clickedSaveSong() throws IOException, SQLException {
        System.out.println("Save Button is working");
        MyTunesManager myTunesManager = new MyTunesManager();
        myTunesManager.createSong(titleSongInput.getText(),artistSongInput.getText(), Float.parseFloat(timeSongInput.getText()),fileSongPathChooseButton.getText());
    }
}
