package org.example;

import java.util.Date;
import java.util.List;

public class Post {
    private int postId;
    private String text;
    private Date timestamp;
    private List<byte[]> images;
    private List<byte[]> videos;

    public Post(int postId, String text, List<byte[]> images, List<byte[]> videos) {
        this.postId = postId;
        this.text = text;
        this.images = images;
        this.videos = videos;
        this.timestamp = new Date();
    }

    // Getters
    public int getPostId() {
        return postId;
    }

    public String getText() {
        return text;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public List<byte[]> getImages() {
        return images;
    }

    public List<byte[]> getVideos() {
        return videos;
    }
}
