package sample.gui.newsong;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

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
    public void clickedNewSongCancel(){
        System.out.println("newSongCancel Button is working");
        //TODO
    }
    public void clickedSaveSong(){
        System.out.println("Save Button is working");
        //TODO
    }
}
