package com.learning.library.Book.domain.interfaces;

import com.learning.library.Book.domain.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookCrudRepository {
    Optional<Book> findById(UUID id);
    List<Book> findAll();
    Book save(Book book);
    void deleteById(UUID id);
    void update(Book book);

}
