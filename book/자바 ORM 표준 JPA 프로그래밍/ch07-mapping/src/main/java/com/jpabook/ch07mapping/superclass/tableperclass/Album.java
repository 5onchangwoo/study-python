package com.jpabook.ch07mapping.superclass.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;
}
