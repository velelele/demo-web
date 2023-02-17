package com.example.demoweb.model;

import java.util.Date;

public class Post {

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
    public Post(String text) {
        this.text = text;
        creationDate = new Date();
    }

    private String text;

    private Integer likes;

    public Date getCreationDate() {
        return creationDate;
    }

    private Date creationDate;


    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
