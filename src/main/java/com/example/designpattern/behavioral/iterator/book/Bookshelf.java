package com.example.designpattern.behavioral.iterator.book;

import com.example.designpattern.behavioral.iterator.iterator.DateIterator;
import com.example.designpattern.behavioral.iterator.iterator.Iterator;
import com.example.designpattern.behavioral.iterator.iterator.NameIterator;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Iterator<Book> getNameIterator() {
        return new NameIterator(books);
    }

    public Iterator<Book> getDateIterator() {
        return new DateIterator(books);
    }

}
