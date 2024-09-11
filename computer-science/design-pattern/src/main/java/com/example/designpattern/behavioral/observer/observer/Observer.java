package com.example.designpattern.behavioral.observer.observer;

import com.example.designpattern.behavioral.observer.subject.Post;

public interface Observer {
    void update(Post post);
}
