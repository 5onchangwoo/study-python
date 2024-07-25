package com.jpabook.ch07mapping.superclass.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

//@Entity
@DiscriminatorValue("M")
public class Movie extends Item {
    private String director;
    private String actor;
}

