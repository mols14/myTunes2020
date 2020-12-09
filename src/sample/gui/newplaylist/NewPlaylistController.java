package sample.gui.newplaylist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    public void clickedCancelPL(ActionEvent event){
        System.out.println("cancel");
        //TODO
    }
}
