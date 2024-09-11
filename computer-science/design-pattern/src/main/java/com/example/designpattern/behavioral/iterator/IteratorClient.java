package com.example.designpattern.behavioral.iterator;

import com.example.designpattern.behavioral.iterator.book.Book;
import com.example.designpattern.behavioral.iterator.book.Bookshelf;
import com.example.designpattern.behavioral.iterator.iterator.Iterator;

import java.time.LocalDate;

public class IteratorClient {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(new Book("객체지향의 사실과 오해", "조영호", LocalDate.of(2015, 6, 17)));
        bookshelf.addBook(new Book("자바의 신", "이상민", LocalDate.of(2023, 10, 16)));
        bookshelf.addBook(new Book("자바의 정석", "남궁성", LocalDate.of(2016, 1, 27)));
        bookshelf.addBook(new Book("나미야 잡화점의 기적", "히가시노 게이고", LocalDate.of(2012, 12, 19)));

        // 이름 순 이터레이터
        Iterator<Book> nameIterator = bookshelf.getNameIterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        System.out.println("============================================");

        // 날짜 순 이터레이터
        Iterator<Book> dateIterator = bookshelf.getDateIterator();
        while (dateIterator.hasNext()) {
            System.out.println(dateIterator.next());
        }


    }
}
