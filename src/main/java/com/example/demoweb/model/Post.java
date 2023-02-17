package com.example.demoweb.model;

import java.util.Date;

public class Post {

    public Post(long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }
    private String text;

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    private int likes;

    public Date getCreationDate() {
        return creationDate;
    }

    private Date creationDate;

    public Long getId() {
        return id;
    }

    private Long id;

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
