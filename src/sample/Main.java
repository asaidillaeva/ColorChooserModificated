package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("colorChooser.fxml"));
        primaryStage.setTitle("Color Chooser Application");
        primaryStage.setScene(new Scene(root, 370, 120));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
