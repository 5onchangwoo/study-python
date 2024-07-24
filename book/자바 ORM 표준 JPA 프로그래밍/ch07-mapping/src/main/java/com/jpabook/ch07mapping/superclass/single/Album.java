package com.jpabook.ch07mapping.superclass.single;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;
}
