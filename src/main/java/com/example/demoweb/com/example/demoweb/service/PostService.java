package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public PostService() {
        posts = new ArrayList<>();
    }


    ArrayList<Post> posts;

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(posts.size(),text, new Date()));
    }
}