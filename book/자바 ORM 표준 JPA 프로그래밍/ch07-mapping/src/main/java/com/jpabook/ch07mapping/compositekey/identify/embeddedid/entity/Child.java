package com.jpabook.ch07mapping.compositekey.identify.embeddedid.entity;


import jakarta.persistence.*;

//@Entity
public class Child {
    @EmbeddedId
    private ChildId id;

    @MapsId("parentId")
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent parent;

    private String name;
}
