import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("resources/sample.fxml"));
        primaryStage.setTitle("Gorner Counter");
        primaryStage.setScene(new Scene(root, 650, 750));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}