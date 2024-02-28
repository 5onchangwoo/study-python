package com.example.designpattern.behavioral.iterator;

import com.example.designpattern.behavioral.iterator.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NoPatternClient {
    public static void main(String[] args) {
        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(new Book("객체지향의 사실과 오해", "조영호", LocalDate.of(2015, 6, 17)));
        bookshelf.add(new Book("자바의 신", "이상민", LocalDate.of(2023, 10, 16)));
        bookshelf.add(new Book("자바의 정석", "남궁성", LocalDate.of(2016, 1, 27)));
        bookshelf.add(new Book("나미야 잡화점의 기적", "히가시노 게이고", LocalDate.of(2012, 12, 19)));

        bookshelf.sort(Comparator.comparing(Book::getName));
        for (Book book : bookshelf) {
            System.out.println(book);
        }
        System.out.println("============================================");

        bookshelf.sort(Comparator.comparing(Book::getDate));
        for (Book book : bookshelf) {
            System.out.println(book);
        }


    }
}
