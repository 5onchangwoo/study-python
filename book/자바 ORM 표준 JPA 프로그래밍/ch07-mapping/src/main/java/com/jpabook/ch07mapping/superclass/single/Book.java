package com.jpabook.ch07mapping.superclass.single;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String auther;
    private String isbn;

}
