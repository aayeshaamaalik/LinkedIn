package org.example;

import java.util.Date;

public class Message {
    private int sendToMemberId;
    private String content;
    private Date timestamp;

    public Message(int sendToMemberId, String content) {
        this.sendToMemberId = sendToMemberId;
        this.content = content;
        this.timestamp = new Date();
    }

    // Getters
    public int getSendToMemberId() {
        return sendToMemberId;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}

