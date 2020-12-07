package sample.gui.newplaylist;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
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

    public void clickedSavePL(){
        System.out.println("Save Button is working");
        //TODO
    }
    public void clickedCancelPL(){
        System.out.println("Cancel Button is working");
        //TODO
    }
}
