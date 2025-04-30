package org.example;

import java.util.*;

public class Member {
    private int memberId;
    private String name;
    private String email;
    private String phone;
    private Date dateOfMembership;
    private String headline;
    private byte[] photo;

    private Account account;
    private Profile profile;
    private List<Integer> connections;

    public Member(int memberId, String name, String email, Account account, Profile profile) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.account = account;
        this.profile = profile;
        this.dateOfMembership = new Date();
        this.connections = new ArrayList<>();
    }

    // Getters and setters
    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public Profile getProfile() {
        return profile;
    }

    public List<Integer> getConnections() {
        return connections;
    }

    public boolean sendMessage(Message msg) {
        // Simulate sending a message
        System.out.println("Message sent to Member ID: " + msg.getSendToMemberId());
        return true;
    }

    public boolean createPost(Post post) {
        // Simulate post creation
        System.out.println("Post created: " + post.getText());
        return true;
    }

    public boolean sendConnectionInvitation(ConnectionInvitation invite) {
        // Simulate sending a connection invite
        System.out.println("Invitation sent to Member ID: " + invite.getSendToMemberId());
        return true;
    }

    public void addConnection(int memberId) {
        if (!connections.contains(memberId)) {
            connections.add(memberId);
        }
    }
}

