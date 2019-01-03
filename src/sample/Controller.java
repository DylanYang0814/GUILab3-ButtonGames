package sample;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Controller {

    int patternNum = 0;

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
            }
            if (random == 3) {
                pattern.add("Air");
            }
            if (random == 4) {
                pattern.add("Earth");
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
