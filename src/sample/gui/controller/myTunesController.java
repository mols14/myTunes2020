package sample.gui.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.be.Song;
import sample.gui.model.SongModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyTunesController implements Initializable {

    public TableView<Song> tableViewSongs;
    public TableColumn<Float,Song> songDurationCol;
    public TableColumn<String, Song> songCatCol;
    public TableColumn<String, Song> songArtistCol;
    public TableColumn<String, Song> songTitleCol;
    private ObservableList observableListSongs;
    private SongModel songModel;


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
    private TextField displaySong;
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
        try {
            observableListSongs = songModel.getSongs();
        } catch (IOException e) {
            e.printStackTrace();
        }
        songTitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        songArtistCol.setCellValueFactory(new PropertyValueFactory<>("artist"));
        songCatCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        songDurationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));
        tableViewSongs.setItems(observableListSongs);
    }

    public MyTunesController() throws IOException {
        tableViewSongs = new TableView<>();
        songModel = new SongModel();

    }

    public void handleMusicPlayPause(){
        songModel.playSong();
    }
    public void handleMusicRewind(){
        System.out.println("musicRewind is working");
        //TODO
    }
    public void handleMusicForward(){
        System.out.println("musicForward is working");
        //TODO
    }
    public void dragVolumeSlider(){
        System.out.println("VolumeSlider is working");
        //TODO
    }
    public void handleSearchInput(){
        System.out.println("SearchInput is working");
        //TODO
    }

    public void handleEditPlaylist(){
        System.out.println("EditPlaylist is working");
        //TODO
    }
    public void handleDeletePlaylist(){
        System.out.println("DeletePlaylist is working");
        //TODO
    }
    public void handleMoveSongDown(){
        System.out.println("MoveSongDown is working");
        //TODO
    }
    public void handleMoveSongUp(){
        System.out.println("MoveSongUp is working");
        //TODO
    }
    public void handleDeleteSongOnPL(){
        System.out.println("DeleteSongOnPL is working");
        //TODO
    }
    public void handleCloseApp(){
        System.out.println("CloseApp is working");
        //TODO
    }
    public void handleEditSong(){
        System.out.println("editSong is working");
        //TODO
    }
    public void handleDeleteSong(){
        System.out.println("DeleteSong is working");
        //TODO
    }
    public void handleSearchButton(){
        System.out.println("SearchButton is working");
        //TODO
    }
    public void handleMoveSongToPL(){
        System.out.println("MoveSongToPL is working");
        //TODO
    }

    public void handleNewPlaylist(javafx.event.ActionEvent event) throws IOException {

        Parent Playlist = FXMLLoader.load(getClass().getResource("/sample/gui/view/newPlaylist.fxml"));
        Scene NewPlaylist = new Scene(Playlist); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindowStage.setScene(NewPlaylist); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }

    public void handleNewSong(ActionEvent actionEvent) throws IOException {
        Parent myTunes = FXMLLoader.load(getClass().getResource("/sample/gui/view/newSong.fxml"));
        Scene newSong = new Scene(myTunes); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        mainWindowStage.setScene(newSong); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }
}
