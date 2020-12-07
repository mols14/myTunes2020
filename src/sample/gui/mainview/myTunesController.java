package sample.gui.mainview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class myTunesController implements Initializable {

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
    public void clickedNewPlayList(){
        System.out.println("NewPlaylist Button is working");
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
    public void clickedNewSong(){
        System.out.println("NewSong is working");
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
}
