package com.learning.library.Book.infrastructure.repository;


import com.learning.library.Book.domain.interfaces.BookCrudRepository;
import com.learning.library.Book.domain.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class BookCrudRepositoryImpl implements BookCrudRepository {
 private final JpaBookCrudRepository jpaBookCrudRepository;

    public BookCrudRepositoryImpl(JpaBookCrudRepository jpaBookCrudRepository) {
        this.jpaBookCrudRepository = jpaBookCrudRepository;
    }

    @Override
    public Optional<Book> findById(UUID id) {
        Optional<BookEntity> bookEntity = jpaBookCrudRepository.findById(id);
        if (bookEntity.isPresent()) {
            Book book = bookEntity.get().Map();
            return Optional.of(book);
        }
        return Optional.empty();

    }

    @Override
    public List<Book> findAll() {
        List<BookEntity> bookEntities = jpaBookCrudRepository.findAll();
        if (bookEntities.isEmpty()) {
            return new ArrayList<>();
        }
        List<Book> books = new ArrayList<>();
        bookEntities.forEach(bookEntity -> {
            Book book = bookEntity.Map();
            books.add(book);
        });
        return books;
    }

    @Override
    public Book save(Book book) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.Build(book);
        BookEntity savedBookEntity = jpaBookCrudRepository.save(bookEntity);
        return savedBookEntity.Map();
    }

    @Override
    public void deleteById(UUID id) {
        jpaBookCrudRepository.deleteById(id);
    }

    @Override
    public void update(Book book) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.Build(book);
        jpaBookCrudRepository.save(bookEntity);
    }
}
