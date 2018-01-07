package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import main.AddedTexts;

public class WindButtonsLabels {
    private Controller controller;

    @FXML
    Button button;
    @FXML
    TextField textField;
    @FXML
    Label label;
    @FXML
    ListView<String> lView;


    AddedTexts addedTexts = new AddedTexts();

    public void setController(Controller controller){
        this.controller = controller;
    }

    @FXML
    void initialize(){
        button.setText("Add this :)");
        label.setText("Quick adding");  //hardcoded in
        lView.setItems(FXCollections.observableList(addedTexts.getTexty()));
    }

    @FXML
    private void onAdd(){
        if(textField.getText().length() < 2){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning");
            alert.setHeaderText("Text shouldnt be empty");
            alert.setContentText("Write something");
            alert.showAndWait();
        }else {
            addedTexts.add(textField.getText());
            initialize();
        }
    }
}
