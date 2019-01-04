package sample;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.util.ArrayList;

public class Controller {

    int patternNum = 0;

    @FXML
    private Button fire_button;
    @FXML
    private Button water_button;
    @FXML
    private Button air_button;
    @FXML
    private Button earth_button;

    public void Transition(Button x) {
        FadeTransition ft = new FadeTransition(Duration.millis(3000), x);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        fire_button.setOpacity(100);
        ft.setAutoReverse(true);

        ft.play();
    }

    ArrayList<String> pattern = new ArrayList<String>();
    boolean playerTurn = false;

    public void generateSaid() {
        patternNum++;
        for (int i = 0; i < patternNum; i++) {
            int random = (int) (Math.random() * 4);
            if (random == 1) {
                pattern.add("Fire");
            }
            if (random == 2) {
                pattern.add("Water");
                Transition(fire_button);
            }
            if (random == 3) {
                pattern.add("Air");
                Transition(fire_button);
            }
            if (random == 4) {
                pattern.add("Earth");
                Transition(fire_button);
            }
        }
    }

    public void addFire(ActionEvent event) {
        System.out.println("Fire");
    }

    public void addWater(ActionEvent event) {
        System.out.println("Water");
    }

    public void addAir(ActionEvent event) {
        System.out.println("Air");
    }

    public void addEarth(ActionEvent event) {
        System.out.println("Earth");
    }
}
