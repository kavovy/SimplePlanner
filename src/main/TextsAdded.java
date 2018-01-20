package main;

import java.util.Date;

public class TextsAdded {
    private Date date;
    private String text;

    public TextsAdded(Date date, String text) {
        this.date = date;
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
}
