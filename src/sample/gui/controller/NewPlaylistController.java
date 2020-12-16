package sample.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.bll.MyTunesManager;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class NewPlaylistController implements Initializable {

    @FXML
    private Button cancelPlaylist;
    @FXML
    private TextField nameInputField;
    @FXML
    private Button savePlaylist;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clickedSavePL() throws IOException, SQLException {
        System.out.println("Save Button is working");
        MyTunesManager myTunesManager = new MyTunesManager();
        myTunesManager.createPlaylist(nameInputField.getText());
    }
    public void clickedCancelPL(javafx.event.ActionEvent event) throws IOException {
        Parent Playlist = FXMLLoader.load(getClass().getResource("/sample/gui/view/myTunes.fxml"));
        Scene NewPlaylist = new Scene(Playlist); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindowStage.setScene(NewPlaylist); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }
}
