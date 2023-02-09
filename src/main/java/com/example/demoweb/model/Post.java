package com.example.demoweb.model;

public class Post {

    public Post(String text) {
        this.text = text;
    }

    private String text;

    private Integer likes;


    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
