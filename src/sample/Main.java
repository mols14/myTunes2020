package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
private static int bredde = 680;
private static int højde = 850;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui/mainview/myTunes.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, højde, bredde));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
