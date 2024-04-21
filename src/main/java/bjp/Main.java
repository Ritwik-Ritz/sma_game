package bjp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Scene scene;

    @Override
    public void start (Stage primaryStage) throws IOException{
        try
        {
            //loads the fmxl file containing the first screen/ main screen of the game 
            //user has 2 options on this screen 
            primaryStage.setTitle("GEM HUNTER");
            // primaryStage.setMaximized(true);
            scene = new Scene(loadFXML("launch-view"), 1280, 720);
    
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void setRoot(String fxml) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
