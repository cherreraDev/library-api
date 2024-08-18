package com.learning.library.Book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Book {
    private UUID id;
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(UUID id,String isbn, String title, String author, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
        this.id = id;
    }

}