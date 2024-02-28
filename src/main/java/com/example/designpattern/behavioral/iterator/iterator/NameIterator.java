package com.example.designpattern.behavioral.iterator.iterator;

import com.example.designpattern.behavioral.iterator.book.Book;

import java.util.Comparator;
import java.util.List;

public class NameIterator implements Iterator<Book> {
    private List<Book> list;
    private int index;

    public NameIterator(List<Book> list) {
        this.list = list;
        this.list.sort(Comparator.comparing(Book::getName));
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Book next() {
        return list.get(index++);
    }
}
