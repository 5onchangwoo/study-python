package com.jpabook.ch07mapping.jointable.onetomany;

import jakarta.persistence.*;

@Entity
public class Child {
    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;
    private String name;
}
