package sample.gui.mainview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class  myTunesController implements Initializable {

    @FXML
    private Button deleteSong;
    @FXML
    private Button editSong;
    @FXML
    private Button newSong;
    @FXML
    private Button closeApp;
    @FXML
    private Button deleteSongOnPL;
    @FXML
    private Button moveSongUp;
    @FXML
    private Button moveSongDown;
    @FXML
    private Button deletePlaylist;
    @FXML
    private Button editPlaylist;
    @FXML
    private Button newPlaylist;
    @FXML
    private Slider volumeSlider;
    @FXML
    private TextField displaySong; // er denne behøver vel ikke en methode ?
    @FXML
    private TextField searchField;
    @FXML
    private Button musicPlayPause;
    @FXML
    private Button musicRewind;
    @FXML
    private Button musicForward;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clickedMusicPlayPause(){
        System.out.println("musicPlayPause is working");
        //TODO
    }
    public void clickedMusicRewind(){
        System.out.println("musicRewind is working");
        //TODO
    }
    public void clickedMusicForward(){
        System.out.println("musicForward is working");
        //TODO
    }
    public void dragVolumeSlider(){
        System.out.println("VolumeSlider is working");
        //TODO
    }
    public void inputSearchField(){
        System.out.println("SearchField is working");
        //TODO
    }

    public void clickedEditPlaylist(){
        System.out.println("EditPlaylist is working");
        //TODO
    }
    public void clickedDeletePlaylist(){
        System.out.println("DeletePlaylist is working");
        //TODO
    }
    public void clickedMoveSongDown(){
        System.out.println("MoveSongDown is working");
        //TODO
    }
    public void clickedMoveSongUp(){
        System.out.println("MoveSongUp is working");
        //TODO
    }
    public void clickedDeleteSongOnPL(){
        System.out.println("DeleteSongOnPL is working");
        //TODO
    }
    public void clickedCloseApp(){
        System.out.println("CloseApp is working");
        //TODO
    }
    public void clickedEditSong(){
        System.out.println("editSong is working");
        //TODO
    }
    public void clickedDeleteSong(){
        System.out.println("DeleteSong is working");
        //TODO
    }
    public void clickedSearchButton(){
        System.out.println("SearchButton is working");
        //TODO
    }
    public void clickedMoveSongToPL(){
        System.out.println("MoveSongToPL is working");
        //TODO
    }

    public void handleNewPlaylist(javafx.event.ActionEvent event) throws IOException {

        Parent Playlist = FXMLLoader.load(getClass().getResource("/sample/gui/newplaylist/newPlaylist.fxml"));
        Scene NewPlaylist = new Scene(Playlist); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindowStage.setScene(NewPlaylist); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }

    public void handleNewSong(ActionEvent actionEvent) throws IOException {
        Parent myTunes = FXMLLoader.load(getClass().getResource("/sample/gui/newsong/newSong.fxml"));
        Scene newSong = new Scene(myTunes); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        mainWindowStage.setScene(newSong); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }
}
