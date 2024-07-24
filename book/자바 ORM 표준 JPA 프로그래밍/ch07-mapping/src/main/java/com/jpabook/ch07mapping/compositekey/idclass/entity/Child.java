package com.jpabook.ch07mapping.compositekey.idclass.entity;

import jakarta.persistence.*;

@Entity
public class Child {

    @Id
    private String id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENET_ID1"),
            @JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENET_ID2")
    })
    private Parent parent;
}
