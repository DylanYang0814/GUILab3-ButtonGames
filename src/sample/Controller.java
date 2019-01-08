package sample;

import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Controller {

    static int patternNum = 2;

    @FXML
    private Button fire_button;
    @FXML
    private Button water_button;
    @FXML
    private Button air_button;
    @FXML
    private Button earth_button;
    @FXML
    private Button start_button;

    static ArrayList<String> pattern = new ArrayList<String>();
    boolean playerTurn = false;


    public void startGame() {
        start_button.setStyle("-fx-background-color: #f74840");
        generateSaid();
    }

    public void Transition(Button x) {
        SequentialTransition s = new SequentialTransition();
        s.setCycleCount(1);
        s.setAutoReverse(false);
        FadeTransition redTransition = new FadeTransition(Duration.millis(300), x);
        redTransition.setAutoReverse(true);
        redTransition.setFromValue(1.0);
        redTransition.setToValue(0.1);
        redTransition.setCycleCount(2);
        s.getChildren().add(redTransition);
        s.play();
    }


    public void generateSaid() {
        patternNum++;
        for (int i = 0; i < patternNum; i++) {
            int random = (int) (Math.random() * 4);
            if (random == 1) {
                pattern.add("Fire");
                System.out.println("Fire");
            }
            if (random == 2) {
                pattern.add("Water");
                System.out.println("Water");
            }
            if (random == 3) {
                pattern.add("Air");
                System.out.println("Air");
            }
            if (random == 4) {
                pattern.add("Earth");
                System.out.println("Earth");
            }
        }
        playerTurn = true;
    }

    public void addFire(ActionEvent event) {
        if (playerTurn && pattern.indexOf("Fire") == 0) {
            System.out.println("Correct");
            pattern.remove(0);
            pattern.add("Fire");
            if (pattern.size() == 0) {
                generateSaid();
                playerTurn = false;
            }
        }
    }

    public void addWater(ActionEvent event) {
        if (playerTurn && pattern.indexOf("Water") == 0) {
            System.out.println("Correct");
            pattern.remove(0);
            pattern.add("Water");
            if (pattern.size() == 0) {
                generateSaid();
                playerTurn = false;
            }
        }
    }

    public void addAir(ActionEvent event) {
        if (playerTurn && pattern.indexOf("Air") == 0) {
            System.out.println("Correct");
            pattern.remove(0);
            pattern.add("Air");
            if (pattern.size() == 0) {
                generateSaid();
                playerTurn = false;
            }
        }
    }

    public void addEarth(ActionEvent event) {
        if (playerTurn && pattern.indexOf("Earth") == 0) {
            System.out.println("Correct");
            pattern.remove(0);
            pattern.add("Earth");
            if (pattern.size() == 0) {
                generateSaid();
                playerTurn = false;
            }
        }
    }
}
