package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image image = new Image("url:http://blog.world-mysteries.com/wp-content/uploads/2018/01/hieroglyphsEG.jpg");
        ImageView mv = new ImageView(image);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Extreme Project - Dylan Yang Period 2-3");
        primaryStage.setScene(new Scene(root, 700, 595));
        primaryStage.show();
        //Controller.generateSaid();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
