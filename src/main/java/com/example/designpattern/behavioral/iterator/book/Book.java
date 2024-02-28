package com.example.designpattern.behavioral.iterator.book;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private LocalDate date;
}
