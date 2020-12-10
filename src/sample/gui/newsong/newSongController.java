package sample.gui.newsong;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class newSongController implements Initializable {

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
        System.out.println("FileSongPathChooseBN  is working");
        //TODO
    }
    public void clickedMoreCategoryBN(){
        System.out.println("MoreCategoryBN is working");
        //TODO
    }
    public void clickedNewSongCancel(javafx.event.ActionEvent event) throws IOException {
        Parent Playlist = FXMLLoader.load(getClass().getResource("/sample/gui/mainview/myTunes.fxml"));
        Scene NewPlaylist = new Scene(Playlist); // Opretter den nye scene
        Stage mainWindowStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainWindowStage.setScene(NewPlaylist); // Vælger den nyoprettede scene
        mainWindowStage.show(); // Viser den nye scene
    }
    public void clickedSaveSong(){
        System.out.println("Save Button is working");
        //TODO
    }
}
