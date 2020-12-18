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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sample.be.Song;
import sample.bll.exception.MyTunesException;
import sample.gui.model.SongModel;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyTunesController implements Initializable {

    public TableView<Song> tableViewSongs;
    public TableColumn<Integer,Song> songDurationCol;
    public TableColumn<String, Song> songCatCol;
    public TableColumn<String, Song> songArtistCol;
    public TableColumn<String, Song> songTitleCol;
    public TextField filterSearch;
    private ObservableList observableListSongs;
    private SongModel songModel;
    private MediaPlayer mediaPlayer;
    private String songsPath = "music/";
    private Boolean isPlaying = false;
    private Boolean isLoaded = false;
    private Song selectedSong;
    private Media media;


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
        selectedSong = tableViewSongs.getSelectionModel().getSelectedItem();
        media = new Media(new File(songsPath + selectedSong.getUrl()).toURI().toString());

        if (selectedSong != null && !isPlaying) {
            try {
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
                isPlaying = true;


            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        else if (selectedSong != null && isPlaying){
            mediaPlayer.pause();
            isPlaying = false;
        } else if(selectedSong != null && !isPlaying){
            mediaPlayer.play();
            isPlaying = true;
        }
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

    public void handleFilterSearch(KeyEvent keyEvent) throws IOException {
        if (filterSearch.getText() == null || filterSearch.getText().length() <= 0) {
            tableViewSongs.setItems(songModel.getSongs());
        } else {
            ObservableList<Song> foundMovieList = songModel.filter(songModel.getSongs(), filterSearch.getText());

            tableViewSongs.setItems(foundMovieList);

        }
    }


}
