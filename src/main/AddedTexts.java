package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddedTexts {
    List<String> texty = new ArrayList<String>();
    List<Date> dates = new ArrayList<Date>();
    //ObservableList<String> obList = FXCollections.observableList(texty);

 /*   public AddedTexts(String texty) {
        this.texty.add(texty);
    }

    public AddedTexts(){
        this("default String");
    }*/
    public String getText(int i){
        return texty.get(i);

    }

    public void add(String text){
        Date date = new Date();
        texty.add(text);
        dates.add(date);
    }
    public void removeText(int i){
        texty.remove(i);
        dates.remove(i);
    }

    public List<String> getTexty() {
        return texty;
    }
}
