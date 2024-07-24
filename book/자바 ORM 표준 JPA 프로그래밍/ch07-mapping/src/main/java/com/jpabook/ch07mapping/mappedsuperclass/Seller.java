package com.jpabook.ch07mapping.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity
public class Seller extends BaseEntity {
    private String shopName;
}
