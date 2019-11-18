package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(final Stage primaryStage) throws IOException {



        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/sample.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load(getClass().getResource("sample.fxml"));

        primaryStage.setScene(new Scene(root, 400,400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        TrainQueyre TRAIN = new TrainQueyre();
*/
