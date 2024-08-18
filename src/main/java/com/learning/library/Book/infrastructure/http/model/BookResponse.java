package com.learning.library.Book.infrastructure.http.model;

import com.learning.library.Book.domain.model.Book;
import lombok.Data;

@Data
public class BookResponse {
    private String isbn;
    private String title;
    private String author;
    private boolean available;


    public BookResponse (Book book){
        isbn = book.getIsbn();
        title = book.getTitle();
        author = book.getAuthor();
        available = book.isAvailable();
    }
}
