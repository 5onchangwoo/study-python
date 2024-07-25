package com.jpabook.ch07mapping.compositekey.nonidentify.entity;

import jakarta.persistence.*;

//@Entity
public class GrandChild {

    @Id @GeneratedValue
    @Column(name = "GRANDCHILD_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CHILD_ID")
    private Child child;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
