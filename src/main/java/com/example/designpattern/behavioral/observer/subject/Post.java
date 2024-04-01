package com.example.designpattern.behavioral.observer.subject;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private String content;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.regDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
