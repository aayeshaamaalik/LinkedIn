package org.example;

import java.util.Date;

public class ConnectionInvitation {
    private int sendToMemberId;
    private Date sentDate;
    private ConnectionInvitationStatus status;

    public ConnectionInvitation(int sendToMemberId) {
        this.sendToMemberId = sendToMemberId;
        this.sentDate = new Date();
        this.status = ConnectionInvitationStatus.PENDING;
    }

    // Getters and setters
    public int getSendToMemberId() {
        return sendToMemberId;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public ConnectionInvitationStatus getStatus() {
        return status;
    }

    public void accept() {
        this.status = ConnectionInvitationStatus.ACCEPTED;
    }

    public void reject() {
        this.status = ConnectionInvitationStatus.REJECTED;
    }
}

