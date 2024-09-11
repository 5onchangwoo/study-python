package com.example.designpattern.behavioral.observer.subject;

import com.example.designpattern.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Observer> observers = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public void registerObserver(Observer o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(Post post) {
        for (Observer observer : observers) {
            observer.update(post);
        }
    }

    public void addPosts(Post post) {
        this.posts.add(post);
        notifyObservers(post);
    }
}
