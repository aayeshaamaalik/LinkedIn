package org.example;

public class Recommendation {
    private String message;
    private String fromMemberName;
    private String date;

    public Recommendation(String message, String fromMemberName, String date) {
        this.message = message;
        this.fromMemberName = fromMemberName;
        this.date = date;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public String getFromMemberName() {
        return fromMemberName;
    }

    public String getDate() {
        return date;
    }
}
