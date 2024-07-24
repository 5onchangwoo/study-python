package com.jpabook.ch07mapping.superclass.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String auther;
    private String isbn;

}
