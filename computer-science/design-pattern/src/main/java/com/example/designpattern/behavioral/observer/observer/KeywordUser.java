package com.example.designpattern.behavioral.observer.observer;

import com.example.designpattern.behavioral.observer.subject.Post;

public class KeywordUser implements Observer{
    String name;
    String keyword;

    public KeywordUser(String name, String keyword) {
        this.name = name;
        this.keyword = keyword;
    }

    @Override
    public void update(Post newPost) {
        if(newPost.getTitle().contains(keyword)) System.out.println(name + " keyword title: " + newPost.getTitle());
    }
}
