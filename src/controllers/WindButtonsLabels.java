package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import main.TextsAdded;

import java.util.Date;

public class WindButtonsLabels {
    private Controller controller;

    @FXML
    Button button;
    @FXML
    TextField textField;
    @FXML
    Label label;
    @FXML
    TableView<TextsAdded> tView;

    ObservableList<TextsAdded> texts = FXCollections.observableArrayList();
    public void setController(Controller controller){
        this.controller = controller;
    }

   @FXML
   TableColumn doCol, dateCol;

    @FXML
    void initialize(){
        button.setText("Add this :)");
        label.setText("Quick adding");  //hardcoded in
        doCol.setCellValueFactory(new PropertyValueFactory<>("text")); //<TextsAdded,String>
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));    //<TextsAdded,Date>
        tView.setItems(texts);

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
            Date date = new Date();
            texts.add(new TextsAdded(date, textField.getText()));
            initialize();
        }
    }
}
