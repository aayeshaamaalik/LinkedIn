package org.example;

public class Accomplishment {
    private String title;
    private String description;
    private String date;

    public Accomplishment(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
