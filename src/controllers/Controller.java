package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class Controller {
    @FXML
    private StackPane stackPane;

    @FXML
    void initialize(){
       FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../view/WindButtonsLabels.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        WindButtonsLabels windButtonsLabels = loader.getController();
        windButtonsLabels.setController(this);

        setScreen(pane);
    }

    public void setScreen(Pane pane){   //instead of using pane u can use parent
        stackPane.getChildren().clear();
        stackPane.getChildren().add(pane);
    }
}
