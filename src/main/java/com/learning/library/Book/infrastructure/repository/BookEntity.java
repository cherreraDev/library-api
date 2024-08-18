package com.learning.library.Book.infrastructure.repository;

import com.learning.library.Book.domain.model.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class BookEntity {
    @Id
    private UUID id;
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public void Build(Book book) {
        id = book.getId();
        isbn = book.getIsbn();
        title = book.getTitle();
        author = book.getAuthor();
        available = book.isAvailable();
    }

    public Book Map(){
        return new Book(id, isbn, title, author, available);
    }

    public BookEntity() {}
}
